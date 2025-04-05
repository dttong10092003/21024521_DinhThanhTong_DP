# Sử dụng Node.js base image
FROM node:14

# Tạo thư mục ứng dụng và copy mã nguồn vào container
WORKDIR /app
COPY . /app

# Cài đặt dependencies
RUN npm install

# Mở port ứng dụng Node.js
EXPOSE 3000

# Chạy ứng dụng Node.js
CMD ["npm", "start"]
