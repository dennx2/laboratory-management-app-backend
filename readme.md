# Laboratory Management Application

The Laboratory Management Application is a comprehensive solution that modernizes healthcare operations by streamlining laboratory management processes, enhancing data security, and providing a user-friendly interface. The application is built using Spring Boot for the backend, PostgreSQL as the database running in Docker containers, and Angular for the frontend.

## Key Features

- **User Management:** Register and log in medical staff, technicians, and administrators with role-based access control.
- **Patient Management:** Efficiently manage patient information, queues, appointments, and medical history.
- **Test Order Management:** Place and track test orders, ensuring seamless communication between physicians and technicians.
- **Test Result Management:** Record and upload test results securely.
- **Search and Filtering:** Easily search and filter patient records and test results.
- **User-friendly Interface:** An intuitive interface ensures usability for all types of users.

## Technologies Used

- Backend: Spring Boot (Java)
- Database: PostgreSQL (Dockerized)
- Frontend: Angular (TypeScript)
- Containerization: Docker
- Other Tools: Maven (Backend Build), npm (Frontend Build), Docker Compose (Deployment)



# Running PostgreSQL on Docker

This README file provides instructions on how to use Docker Compose to manage your PostgreSQL database with docker-compose commands.
## Prerequisites

Before you begin, ensure you have the following installed on your system:

- Docker: [Install Docker](https://docs.docker.com/get-docker/)

## Using Docker Compose

### 1. Start Container (Your database instance)

Run `docker-compose up` at the root of the project

Once Postgres is running, you can run your project to interact with the database.

### 2. Stop Container

Run `docker-compose down` at the root of the project
