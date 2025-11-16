# GameFlix – Dockerized Spring Boot Application

## 📘 Overview
GameFlix is a Spring Boot application that connects to a MySQL database using Docker Compose.  
This setup allows you to easily build, run, and test the backend in isolated containers without needing to manually install dependencies.

---

## 🐳 How to Build and Run the Container

### 1. Build the Spring Boot JAR
Before running Docker, package the application:
```bash
mvn clean package -DskipTests
```

---

### 2. Build and Start the Containers
Run this command from your project’s root directory (where the Dockerfile and docker-compose.yml are located):
```bash
docker-compose up --build
```
This will:
- Build the Docker image for GameFlix
- Start both the **GameFlix backend app** and **MySQL** containers

---

### 3. Access the Application
Once running, open your browser and go to:
👉 [http://localhost:8081](http://localhost:8081)

If you see “Whitelabel Error Page” or an API response, the backend is running successfully.

---

### 4. Stop the Containers
To stop and remove containers, networks, and volumes:
```bash
docker-compose down -v
```

---

## ⚙️ Environment Details
- **Java:** OpenJDK 17
- **Spring Boot:** 3.3.x
- **Database:** MySQL 8.4
- **Port:** 8081

---

## 📁 Folder Structure
```
GameFlix/
├── Dockerfile
├── docker-compose.yml
├── README.md
├── pom.xml
├── src/
└── target/
```

---

## 🧾 Notes
- The database credentials and connection URL are defined in `application-docker.properties`
- The backend waits until MySQL passes its health check before starting
- To rebuild after changes, use:
  ```bash
  docker-compose up --build --force-recreate
  ```

