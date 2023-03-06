# instagram-rest-api

![Screenshot (94)](https://user-images.githubusercontent.com/41718548/223136440-70cdaf17-d194-4591-ab8e-b4c0a9d9aeec.png)


## Frameworks and Language Used
Spring Boot
Java 11
Jakarta Persistence API (JPA)
Maven


### Controller:
The controller package contains the classes responsible for handling HTTP requests and responses. It consists of the following classes:
1. UserController: Handles user-related HTTP requests (POST, GET, PUT).
2. PostController: Handles post-related HTTP requests (POST, GET, PUT).

### Services:
The service package contains the classes responsible for processing business logic. It consists of the following classes:
1. UserService: Implements methods for handling user-related business logic (saving, getting, updating).
2. PostService: Implements methods for handling post-related business logic (saving, getting, updating).

### Repository:
The repository package contains the classes responsible for interacting with the database. It consists of the following class:
1. UserRepository: Defines methods for performing CRUD operations on the tbl_user table.
2. PostRepository: Defines methods for performing CRUD operations on the tbl_post table. 

