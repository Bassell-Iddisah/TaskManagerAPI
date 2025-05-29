# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /TaskManagerAPI/src/main/java/org/example/taskmanagementapi

# Copy the jar file (adjust the path if necessary)
COPY target/TaskManagementAPI-0.0.1-SNAPSHOT.jar TaskManagerAPI.jar

# Expose port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "TaskManagerAPI.jar"]
