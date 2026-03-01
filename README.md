Spring Boot REST API – CRUD Operations with PostgreSQL

This project is a RESTful backend application built using Spring Boot and PostgreSQL. It demonstrates the implementation of full CRUD (Create, Read, Update, Delete) operations using Spring Data JPA and follows a layered architecture approach.

The application exposes REST endpoints to manage Software Engineer entities and performs database operations through a PostgreSQL instance running inside Docker.

This project reflects practical backend development concepts including API design, database integration, service-layer abstraction, and version control using Git.

Technologies Used

Java 21
Spring Boot
Spring Data JPA
Hibernate
PostgreSQL
Docker
Maven
Git





**Architecture**************
The application follows a layered structure:
Controller Layer
Handles HTTP requests and responses.
Service Layer
Contains business logic and communicates between controller and repository.
Repository Layer
Interacts with the database using Spring Data JPA.
Database
PostgreSQL running in a Docker container.\





**Features**
Create a new Software Engineer
Retrieve all Software Engineers
Retrieve a Software Engineer by ID
Update an existing Software Engineer
Delete a Software Engineer
Automatic table generation using JPA\
JSON-based request and response handling





**REST API Endpoints**

Create Engineer
POST /api/v1/software-engineers

Get All Engineers
GET /api/v1/software-engineers

Get Engineer By ID
GET /api/v1/software-engineers/{id}

Update Engineer
PUT /api/v1/software-engineers/{id}

Delete Engineer
DELETE /api/v1/software-engineers/{id}









**Database Configuration**

The application connects to a PostgreSQL database configured in application.properties.
Example configuration:
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
Ensure that PostgreSQL is running before starting the application.








**Running the Application**

Start PostgreSQL using Docker or local installation.
Update database credentials in application.properties.
Build the project using Maven.
Run the Spring Boot application.\
Test endpoints using Postman or any HTTP client.
Learning Outcomes
Through this project, the following backend concepts were implemented:
RESTful API development
CRUD operations using Spring Data JPA
Entity mapping and ORM using Hibernate
Docker-based database setup
Git version control and repository management
Layered backend architecture design


**Author**
Ayush Kute
Software Engineer 
