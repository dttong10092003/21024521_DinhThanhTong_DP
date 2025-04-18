# Chọn image Node.js làm base image
FROM node:18

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt các dependencies
RUN npm install

# Copy toàn bộ mã nguồn vào container
COPY . .

# Expose port mà Order Service sẽ chạy trên container
EXPOSE 4001

# Chạy ứng dụng
CMD ["node", "server.js"]
