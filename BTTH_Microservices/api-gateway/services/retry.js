// api-gateway/resilientClient.js
const axios = require('axios');
const CircuitBreaker = require('opossum');
const { RateLimiterMemory } = require('rate-limiter-flexible');

// 👉 Giới hạn 10 request mỗi giây
const rateLimiter = new RateLimiterMemory({
  points: 10,
  duration: 1,
});

// 👉 Hàm gọi axios
const axiosCall = async (url, options = {}) => {
  console.log('🔁 Gọi:', url);
  return await axios({ url, ...options });
};

// 👉 Cấu hình Circuit Breaker
const breakerOptions = {
  timeout: 5000,                  // ⏱ Time Limiter: 10s
  errorThresholdPercentage: 50,    // 🔴 Mở breaker nếu > 50% lỗi
  resetTimeout: 10000,             // ⏳ Sau 10s breaker mới thử lại
  volumeThreshold: 3               // Cần ít nhất 3 request để đánh giá
};

const breaker = new CircuitBreaker(axiosCall, breakerOptions);

// 🌀 Retry thủ công: gọi lại nếu thất bại
const fireWithRetry = async (url, options = {}, maxRetries = 2, retryDelay = 1000) => {
  for (let attempt = 0; attempt <= maxRetries; attempt++) {
    try {
      console.log(`⚡ Retry attempt ${attempt + 1} for ${url}`);
      const res = await breaker.fire(url, options);
      return { data: res.data };
    } catch (err) {
      console.error(`❌ Retry ${attempt + 1} failed:`, err.message);
      if (attempt === maxRetries) {
        return { error: 'Service unavailable after retries' };
      }
      await new Promise((resolve) => setTimeout(resolve, retryDelay));
    }
  }
};

// 🌐 Hàm gọi chung: RateLimiter + Retry + CircuitBreaker
const callService = async (url, options = {}) => {
  try {
    await rateLimiter.consume('api-gateway'); // ⚡ Rate limit check
    const result = await fireWithRetry(url, options, 2, 1000); // 🔁 Retry 2 lần cách nhau 1s
    return result;
  } catch (err) {
    if (err.msBeforeNext !== undefined) {
      console.warn('⏱ Quá giới hạn request:', err.msBeforeNext, 'ms');
    } else {
      console.error('🚨 Lỗi không xác định:', err.message);
    }
    return { error: 'Gateway error' };
  }
};

module.exports = { callService };
