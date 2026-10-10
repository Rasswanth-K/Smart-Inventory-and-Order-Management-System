# Inventory Management System

A web-based Inventory Management System built using **Java, Spring Boot, Spring Data JPA, and MySQL**. This project helps manage product details, monitor stock levels, handle customer orders, and view inventory statistics through a simple dashboard.

## Features

- **Product Management:** Add, view, update, and delete products.
- **Stock Monitoring:** Identify products with quantities below 10 units.
- **Order Management:** Create orders, view orders, and update order status and priority.
- **Dashboard:** View total product count and low-stock product count.
- **Database Integration:** Store and manage data using MySQL.
- **Web Interface:** Simple frontend built with HTML, CSS, and JavaScript.
- **REST APIs:** Handle product, order, and dashboard operations through HTTP endpoints.

## Tech Stack

- **Backend:** Java 17, Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA, Hibernate
- **Frontend:** HTML, CSS, JavaScript
- **Build Tool:** Maven
- **Development Tools:** IntelliJ IDEA, Git, GitHub

## Project Structure

```text
inventory_system/
├── src/main/java/com/example/inventory_system/
│   ├── controller/
│   │   ├── DashboardController.java
│   │   ├── OrderController.java
│   │   └── ProductController.java
│   ├── model/
│   │   ├── Orders.java
│   │   └── Product.java
│   ├── repository/
│   ├── service/
│   └── InventorySystemApplication.java
├── src/main/resources/
│   ├── static/
│   │   ├── index.html
│   │   ├── style.css
│   │   └── script.js
│   └── application.properties
└── pom.xml
```

## Prerequisites

Make sure you have installed:

- Java JDK 17 or a compatible version
- MySQL Server
- Git
- IntelliJ IDEA or another Java IDE

## Installation and Setup

**1. Clone the repository**

```bash
git clone https://github.com/YOUR_USERNAME/inventory_system.git
cd inventory_system
```

**2. Create the MySQL database**

```sql
CREATE DATABASE inventory_db;
```

**3. Configure database credentials**

Open `src/main/resources/application.properties` and configure your MySQL username and password.

```properties
spring.application.name=inventory_system

spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace the placeholders with your local MySQL credentials. Do not commit real passwords to GitHub.

**4. Run the application**

On Windows:

```bash
mvnw.cmd spring-boot:run
```

On Linux or macOS:

```bash
./mvnw spring-boot:run
```

**5. Open the application**

Visit:

[http://localhost:8080/](http://localhost:8080/)

## REST API Endpoints

| Method | Endpoint              | Description                              |
| ------ | --------------------- | ---------------------------------------- |
| GET    | `/products`           | Retrieve all products                    |
| POST   | `/products`           | Add a new product                        |
| PUT    | `/products/{id}`      | Update a product                         |
| DELETE | `/products/{id}`      | Delete a product                         |
| GET    | `/products/low-stock` | Retrieve products with quantity below 10 |
| GET    | `/orders`             | Retrieve all orders                      |
| POST   | `/orders`             | Create a new order                       |
| PUT    | `/orders/{id}`        | Update order status and priority         |
| GET    | `/dashboard`          | Retrieve dashboard statistics            |

## Learning Outcomes

- Developed RESTful APIs using Spring Boot.
- Implemented CRUD operations with Spring Data JPA.
- Connected a Java application to a MySQL database.
- Applied the controller-service-repository architecture.
- Integrated a frontend with backend APIs using JavaScript Fetch.

## Future Improvements

- Add user authentication and role-based access.
- Implement product search and category filters.
- Add input validation and centralized exception handling.
- Improve the dashboard with charts and reports.
- Add automated tests and API documentation.

## Author

**Rasswanth K**

Computer Science Engineering Student

---

