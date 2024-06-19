# Simple Spring Boot API for User Management

This project is a simple Spring Boot API for managing users. It is created for educational purposes to demonstrate the basic CRUD operations using Spring Boot.

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Getting Started](#getting-started)
4. [Running the Application](#running-the-application)
5. [API Endpoints](#api-endpoints)

## Features
- Create a new user
- Retrieve a list of users
- Retrieve a single user by ID
- Update an existing user
- Delete a user

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Getting Started

### Prerequisites
- Java 22 or higher
- Maven  3.9.6  or higher

### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/pedrobotolli/SpringBootDemoApi.git
    cd SpringBootDemoApi
    ```

2. Build the project:
    ```bash
    mvn clean install
    ```

## Running the Application
1. Start the application:
    ```bash
    mvn spring-boot:run
    ```

2. The application will be running at `http://localhost:8080`.

## API Endpoints

### Create a New User
- **URL:** `/`
- **Method:** `POST`
- **Request Body:**
    ```json
    {
        "name": "John Doe",
        "email": "john.doe@example.com"
    }
    ```
- **Response:**
    ```json
    {
        "id": "550e8400-e29b-41d4-a716-446655440000",
        "name": "John Doe",
        "email": "john.doe@example.com"
    }
    ```

### Retrieve a List of Users
- **URL:** `/`
- **Method:** `GET`
- **Response:**
    ```json
    [
        {
            "id": "550e8400-e29b-41d4-a716-446655440000",
            "name": "John Doe",
            "email": "john.doe@example.com"
        },
        {
            "id": "6f1e1c29-afe3-4d2b-ace8-ef9af76e5077",
            "name": "Jane Smith",
            "email": "jane.smith@example.com"
        }
    ]
    ```

### Retrieve a Single User by ID
- **URL:** `/{id}`
- **Method:** `GET`
- **Response:**
    ```json
    {
        "id": "550e8400-e29b-41d4-a716-446655440000",
        "name": "John Doe",
        "email": "john.doe@example.com"
    }
    ```

### Update an Existing User
- **URL:** `/{id}`
- **Method:** `PUT`
- **Request Body:**
    ```json
    {
        "name": "Johnathan Doe",
        "email": "johnathan.doe@example.com"
    }
    ```
- **Response:**
    ```json
    {
        "id": "550e8400-e29b-41d4-a716-446655440000",
        "name": "Johnathan Doe",
        "email": "johnathan.doe@example.com"
    }
    ```

### Delete a User
- **URL:** `/{id}`
- **Method:** `DELETE`
- **Response:** `204 No Content`

