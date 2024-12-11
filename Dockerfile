# Use an official JDK runtime as a parent image
FROM openjdk:23-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven/Gradle-built JAR into the container
COPY target/employee-docker-demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]