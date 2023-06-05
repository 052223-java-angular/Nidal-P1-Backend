# Nidal-P1-Backend

# P1 - Java-Angular FUll Stack Project

## Introduction

This is a Full Stack for pet reservation application. The application will be primarily built using Java, HTML, CSS and angular. The project will utilize a PostgreSQL database to store breedres' profiles and their puppies and will allow user to reserve puppies and rate their experience with the purchase.

## User Stories

- **As a breeder**, I want to register an account so that I can have my contact infromation on my profile.
- **As a breeder**, I want to log in to my account so that I can remove sold pet or add pets for sale.
- **As a user**, I want to browse through products without or with log in.
- **As a user**, I want to search for products by name, breed, or price range so that I can find what I'm looking for.
- **As a user**, I want to reserve a pet and send my contact information to the breeder.
- **As a user**, I want to be able to pay deposit to the breeder.
- **As a user**, I want to rate and review breeders so that I can share my experience with other users.
- **As a user**, I want to view ratings and reviews from other users so that I can make informed buying decisions.


## MVP (Minimum Viable Product)
- Adding Users profiles and save contact information. 
- Breeder registration and login.
- Customer Browsing and searching for pets.
- Customer reservation.
- Breeders rating and reviewing.
- Showing the most selling breeders.
- showing the high rated breeders.
- User able to see reserved pet with reserved label on their page.

## Stretch Goals

- Implementing a recommendation system based on user's previous purchases
- Adding an admin role that can add, remove, or modify breeders.
- Showing the most selling breeders.
- showing the high rated breeders.

- User able to see reserved pet with reserved label on their page.

## Tech Stacks

- **Java**: The main programming language used for building the application.
- **PostgreSQL**: Used as the database to store user, product, and order data.
- **Maven or Gradle**: Used for managing project dependencies.
- **JUnit**: A testing framework for Java applications, used to ensure our code works as expected.
- **Log4j**: A logging utility for debugging purposes.
- **JDBC (Java Database Connectivity)**: An API for connecting and executing queries on the database.
- **BCrypt**: A Java library for hashing and checking passwords for security.
- **JUnit, Mockito, and PowerMock**: Used for unit and integration testing.
- **Git and GitHub**: Used for version control.
- **External API.
- **Angular.
- **HTML and CSS.

## Requirements

- **Clean Codebase**: All code should be clean and well-documented. The repository should not include any unnecessary files or folders such as the `target/`, `.DS_Store`, etc. All files and directories should be appropriately named and organized.

- **Database Design**: The database should be designed following the principles of the 3rd Normal Form (3NF) to ensure data integrity and efficiency. An Entity Relationship Diagram (ERD) should be included in the documentation.

- **Secure**: All sensitive user data such as passwords must be securely hashed before storing it in the database. The application should not display any sensitive information in error messages.

- **Error Handling**: The application should handle potential errors gracefully and provide clear and helpful error messages to the users.

- **Testing**: The application should have a high test coverage. Unit tests and integration tests should be implemented using JUnit, Mockito, and PowerMock.

- **Version Control**: The application should be developed using a version control system, preferably Git, with regular commits denoting progress.

- **Documentation**: The repository should include a README file with clear instructions on how to run the application. Code should be well-commented to allow for easy understanding and maintenance.

- **Scalable**: The design of the application should be scalable, allowing for easy addition of new features or modifications in the future.
