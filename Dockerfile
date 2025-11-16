# Use Microsoft OpenJDK 17 as the base image
FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu

# Create a volume for temporary files
VOLUME /tmp

# Define the build artifact (the .jar file created by Maven)
ARG JAR_FILE=target/*.jar

# Copy the compiled JAR file into the image
COPY ${JAR_FILE} app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]

