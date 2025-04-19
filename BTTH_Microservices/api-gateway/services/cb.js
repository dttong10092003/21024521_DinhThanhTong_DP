// api-gateway/resilientClient.js
const axios = require('axios');
const CircuitBreaker = require('opossum');
const { RateLimiterMemory } = require('rate-limiter-flexible');

// 👉 Giới hạn 10 request mỗi giây
const rateLimiter = new RateLimiterMemory({
  points: 5,
  duration: 5,
});

// 👉 Hàm gọi axios
const axiosCall = async (url, options = {}) => {
  console.log('🔁 Gọi:', url);
  return await axios({ url, ...options });
};

// 👉 Cấu hình Circuit Breaker đầy đủ
const breakerOptions = {
  timeout: 100,                   // ⏱ Time Limiter: 5s timeout
  errorThresholdPercentage: 50,   // Mở breaker nếu > 50% lỗi
  resetTimeout: 10000,            // 10s sau sẽ thử lại
  volumeThreshold: 3,              // Phải có ít nhất 3 request mới bắt đầu tính
  maxRetries: 3 
};

const breaker = new CircuitBreaker(axiosCall, breakerOptions);

// 👉 Gọi qua breaker + rate limit
const callService = async (url, options = {}) => {
  try {
    await rateLimiter.consume('api-gateway'); // ⚡ Rate limiter
    const response = await breaker.fire(url, options); // 🔌 Circuit Breaker
    return { data: response.data };
  } catch (err) {
    if (err instanceof Error && err.msBeforeNext !== undefined) {
      console.log('⚡ Rate Limit kích hoạt:', err.msBeforeNext, 'ms');
    } else {
      console.error(`❌ Lỗi khi gọi service: ${url} -`, err.message);
    }
    return { error: err.message || 'Service unavailable' };
  }
};

module.exports = { callService };
