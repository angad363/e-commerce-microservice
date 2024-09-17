
# E-commerce Backend - Microservices Architecture

## Overview

This project is a backend implementation of an E-commerce application, transitioning from a monolithic architecture to a microservices architecture. The system is composed of several independent services for handling customers, products, orders, payments, and notifications, each managed as its own microservice.

![diagram-export-9-13-2024-1_44_41-PM (1)](https://github.com/user-attachments/assets/07de24db-0f64-4f09-bdf4-924f103ab76b)


## Tech Stack

- **Java 21**: Base programming language for all services
- **Spring Boot 3**: For building REST APIs and handling service logic
- **PostgreSQL**: Database for product, order, and payment services
- **MongoDB**: Database for customer and notification services
- **Apache Kafka**: Asynchronous message streaming for communication between services
- **Docker**: Containerization for service deployment
- **Eureka Discovery Server**: Service registry for service discovery
- **Config Server**: Centralized configuration management for microservices
- **Zipkin**: Distributed tracing for monitoring and logging

## Microservices Overview

1. **Customer Service**: Manages customer information and profiles.
2. **Product Service**: Manages product catalog, pricing, and availability.
3. **Order Service**: Handles order creation, management, and tracking.
4. **Payment Service**: Processes payments for customer orders.
5. **Notification Service**: Sends email notifications to users after orders are confirmed and payments are processed.
6. **Config Server**: Provides external configuration to all services.
7. **Eureka Discovery Server**: Registers and discovers services dynamically.

## Features

- **Microservices Architecture**: Services are decoupled, independently deployable, and can scale horizontally.
- **Asynchronous Communication**: Apache Kafka enables efficient communication between services.
- **Email Notifications**: Automated email notifications sent to users upon successful order confirmation and payment.
- **Distributed Tracing**: Zipkin provides end-to-end visibility for requests across services, aiding in debugging and performance monitoring.

## Getting Started

### Prerequisites

- **Java 21** installed
- **Docker** installed for containerization
- **PostgreSQL** and **MongoDB** set up locally or via Docker
- **Kafka** and **Zookeeper** for messaging (can be set up via Docker)

### Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/ecommerce-microservices-backend.git
   cd ecommerce-microservices-backend
   ```

2. Start all services using Docker Compose:

   ```bash
   docker-compose up
   ```

3. Once services are running, access them via their respective API endpoints.

4. Eureka Discovery Server can be accessed at:

   ```
   http://localhost:8761/
   ```

5. Use Postman or any API client to test the REST APIs of each service.

### Database Setup

- **PostgreSQL**: Used for Product, Order, and Payment services. Ensure you set the correct connection settings in the respective service's `application.properties`.
  
- **MongoDB**: Used for Customer and Notification services. Ensure MongoDB is running and accessible.

### Kafka Setup

Ensure that Kafka and Zookeeper are up and running (via Docker or locally) to handle asynchronous messaging.

## Distributed Tracing

- Zipkin is used for logging and tracing service interactions. Access the Zipkin dashboard at:

  ```
  http://localhost:9411/
  ```

## Dockerization

All services are containerized using Docker for consistent deployment. Simply run:

```bash
docker-compose up
```

to spin up all services along with their dependencies (PostgreSQL, MongoDB, Kafka, etc.).

## Future Enhancements

- Add more robust error handling and fault tolerance across services.
- Implement OAuth2 for authentication and authorization.
- Introduce load balancing using Spring Cloud Gateway.
- Add more features to notification service (e.g., SMS notifications).

## Contributing

Feel free to submit issues, fork the repo, and submit pull requests! Contributions are welcome.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
