# # Dockerfile para Frontend Angular
# FROM node:18-alpine as builder

# WORKDIR /app
# COPY package*.json ./
# RUN npm ci --only=production

# COPY . .
# RUN npm run build --prod

# # Nginx para servir la aplicación
# FROM nginx:alpine
# COPY --from=builder /app/dist/* /usr/share/nginx/html/
# COPY nginx.conf /etc/nginx/nginx.conf

# EXPOSE 80
# CMD ["nginx", "-g", "daemon off;"]
