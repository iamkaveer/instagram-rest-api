# instagram-rest-api

![Screenshot (94)](https://user-images.githubusercontent.com/41718548/223136440-70cdaf17-d194-4591-ab8e-b4c0a9d9aeec.png)


## Frameworks and Language Used

Spring Boot

Java 11

Jakarta Persistence API (JPA)

Maven

## Data Flow

### Controller:

The controller package contains the classes responsible for handling HTTP requests and responses. It consists of the following classes:

-UserController: Handles user-related HTTP requests (POST, GET, PUT).

-PostController: Handles post-related HTTP requests (POST, GET, PUT).

### Services:

The service package contains the classes responsible for processing business logic. It consists of the following classes:

-UserService: Implements methods for handling user-related business logic (saving, getting, updating).

-PostService: Implements methods for handling post-related business logic (saving, getting, updating).

### Repository:
The repository package contains the classes responsible for interacting with the database. It consists of the following class:

-UserRepository: Defines methods for performing CRUD operations on the tbl_user table.

-PostRepository: Defines methods for performing CRUD operations on the tbl_post table. 

## DataBase Design

The database consists of two tables: tbl_user and tbl_post. tbl_user contains columns for user details, while tbl_post contains columns for post details and a foreign key referencing the tbl_user table.
