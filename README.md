# Product Search Module using Spring Boot, JPQL, and Query Methods

## Overview

This project implements a product search module for an e-commerce application using Spring Boot and Spring Data JPA. It demonstrates the use of derived query methods and JPQL (Java Persistence Query Language) to perform efficient database operations such as category-based filtering, price range filtering, and sorting.

## Objectives

* Implement category-based product search
* Filter products within a specified price range
* Retrieve products sorted by price
* Fetch products above a certain price
* Use derived query methods and JPQL queries effectively

## Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database (In-memory)
* Maven
* Postman

## Project Structure

```
com.example.productsearch
│
├── controller
│   └── ProductController.java
│
├── entity
│   └── Product.java
│
├── repository
│   └── ProductRepository.java
│
├── service
│   └── ProductService.java
│
└── ProductSearchApplication.java
```

## Features

* Derived query methods:

  * Find products by category
  * Find products within a price range
* JPQL queries:

  * Sort products by price
  * Fetch products above a given price
  * Retrieve products by category
* RESTful API endpoints for testing all operations

## API Endpoints

### Get Products by Category

```
GET /products/category/{category}
```

### Filter Products by Price Range

```
GET /products/filter?min={min}&max={max}
```

### Get Products Sorted by Price

```
GET /products/sorted
```

### Get Products Above a Certain Price

```
GET /products/expensive/{price}
```

## Sample Data

The application loads sample product data at startup:

* iPhone (Electronics, 80000)
* Laptop (Electronics, 60000)
* Shoes (Fashion, 3000)
* T-shirt (Fashion, 800)
* Watch (Accessories, 5000)

## Configuration

The application uses an H2 in-memory database. Configuration is defined in `application.properties`.

H2 Console:

```
http://localhost:8080/h2
```

## How to Run

1. Clone the repository

```
git clone <repository-url>
```

2. Navigate to the project directory

```
cd productsearch
```

3. Build and run the application

```
mvn spring-boot:run
```

4. Test the APIs using Postman or any REST client

## Expected Outcome

* Successful retrieval of products based on category, price range, and sorting criteria
* Efficient database interaction using Spring Data JPA

## Conclusion

This project demonstrates how Spring Data JPA simplifies database operations by enabling developers to use derived query methods and JPQL instead of writing complex SQL queries. It improves code readability, reduces development effort, and enhances maintainability.

## Note

This project is for academic and educational purposes.
