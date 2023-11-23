# GitHub Action Demo

This is a simple Spring Boot application demonstrating the Dockerization of a Spring Boot application and its integration with CI/CD through GitHub Actions. 
The application exposes a REST endpoint that returns a "Hello from Spring Boot application containerised with Docker and integrated with CI/CD through GitHub Actions." message.

## Project Structure

The project structure is a standard Maven project layout. The main components are:

- **src/main/java**: Contains the Java source code.
- **src/main/resources**: Contains application properties and other resources.
- **Dockerfile**: Specifies the Docker image configuration.
- **.github/workflows/maven-docker-ci-cd.yml.yml**: GitHub Actions workflow for building and pushing the Docker image.

## Build and Run

### Prerequisites

- [Java Development Kit (JDK)](https://openjdk.java.net/install/)
- [Docker](https://docs.docker.com/get-docker/)
- [Maven](https://maven.apache.org/download.cgi) (Optional, as Maven Wrapper is included)

### Build the Application

```bash
./mvnw package
```

### Build and Run Docker Image Locally

```bash
docker build -t github-action-demo .
docker run -p 8080:8080 github-action-demo
```

The application will be accessible at http://localhost:8080/api/github-action/v1/hello-world.

# GitHub Actions Workflow

The GitHub Actions workflow is defined in the `.github/workflows/maven-docker-ci-cd.yml` file. It performs the following steps on each push to the main branch:

1. Checkout the repository.
2. Set up the JDK.
3. Build the application with Maven.
4. Set up Docker Buildx (for building multi-platform Docker images).
5. Build and push the Docker image to DockerHub.

The Docker image is tagged with a timestamp for versioning.

## Docker Image Configuration

The application is packaged into a Docker image using the `openjdk:21-jdk` base image. The Dockerfile copies the JAR file into the image, exposes port 8080, and specifies the entry point.

## CI/CD Integration

The CI/CD process is automated using GitHub Actions. The workflow is triggered on each push to the main branch. It builds the application, creates a Docker image, and pushes it to DockerHub.

### DockerHub Repository

The Docker image is pushed to the repository: [nishadnijam/github-action-demo](https://hub.docker.com/r/nishadnijam/github-action-demo).

## Application Endpoint

The application exposes a REST endpoint at [http://localhost:8080/api/github-action/v1/hello-world](http://localhost:8080/api/github-action/v1/hello-world), which returns a "Hello from Spring Boot application containerised with Docker and integrated with CI/CD through GitHub Actions." message.
