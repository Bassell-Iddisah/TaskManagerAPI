# Task Manager API
A simple task manager RESTFUL api built with spring boot and following the clean architecture principle and dockerized for consistent deployment.

---
## Features
 - CRUD functionality(Create, Read, Update, Delete)
 - In-memory persistence using Hashmaps
 - Clean architecture using Spring IoC and Dependency Injection
 - Packaged with Docker for consistent deployment

---
## Requirements
 - Java 17+
 - Maven
 - Docker Desktop

---
## Run locally

### 1. Build the project
``bash
mvn clean package -DskipTests
``

### 2. Build Docker image
docker build -t taskmanager-api .

### 3. Run container
docker run -p 8080:8080 taskmanager-api

### 4. Test API
 - Base URL: http://localhost:8080/api/tasks
 - Example endpoints:
 - - POST /api/tasks
 -  - GET /api/tasks
 -  - GET /api/tasks/{id}
 -  - PUT /api/tasks/{id}
 -  - DELETE /api/tasks/{id}