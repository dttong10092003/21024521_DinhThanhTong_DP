# Sử dụng image Nginx làm base image
FROM nginx:alpine

# Sao chép cấu hình Nginx vào container
COPY nginx/default.conf /etc/nginx/conf.d/

# Sao chép thư mục build của React vào thư mục html của Nginx
COPY build/ /usr/share/nginx/html/

# Mở cổng 80 để serve ứng dụng
EXPOSE 80

# Chạy Nginx khi container khởi động
CMD ["nginx", "-g", "daemon off;"]
