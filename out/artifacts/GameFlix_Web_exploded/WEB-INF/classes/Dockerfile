# Use Microsoft OpenJDK 17 as the base image
FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu

# Set working directory
WORKDIR /app

# Create a volume for temporary files (optional, but fine)
VOLUME /tmp

# Copy the compiled JAR file from the target folder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose port 8081 (so Docker knows your app listens here)
EXPOSE 8081

# Run the Spring Boot JAR
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
