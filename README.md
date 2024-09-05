# Selenium Hands-On
# Watch Module Automation with Page Object Model

## Introduction
This project involves automating the Watches module of an e-commerce application using Selenium WebDriver with the Page Object Model (POM) design pattern. The purpose of this project is to demonstrate how to create automated tests that ensure the functionality and reliability of the watches module. The project aims to enhance testing efficiency, improve test maintenance, and reduce the time required to validate the module's features.

## Project Type
Selenium Automation | Automation Testing

## Directory Structure
PageObjectModel-Construct-Week-Project-B38/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  ├─ page_Classes/
│  ├─ test/
│  │  │  ├─ com.Utilities/
│  │  │  ├─ utils/
│  │  │  ├─ generics/
│  │  │  ├─ testSuite/
│  │  │  └─ BaseTest.java
│  │  └─ resources/
│  │  │  └─ config.Properties
├─ pom.xml

## Video Walkthrough of the project
Attach a very short video walkthough of all of the features [ 1 - 3 minutes ]

## Video Walkthrough of the codebase
Attach a very short video walkthough of codebase [ 1 - 5 minutes ]

## Features
List out the key features of your application.

- Automated testing of the Watches module using Selenium WebDriver.
- Implementation of Page Object Model (POM) for better code organization and maintenance.
- End-to-end testing scenarios for verifying core functionalities of the module.
- Integration with TestNG for structured test execution and reporting.

## design decisions or assumptions

- The Page Object Model (POM) design pattern is used for separating page elements and actions.
- TestNG is used for test execution and reporting due to its flexibility and ease of use.
Assumption: The application under test is stable, and the structure of web elements is not frequently changing.

## Installation & Getting started
To set up and run the project locally, follow these steps:

1. Clone the repository:
   bash
   git clone https://github.com/kanish-24/Selenium-HandsOn-Project-Naaptol-2024
   cd your-repository
   
3. Install dependencies and configure the project:
   Ensure you have Java and Maven installed.
   Configure your WebDriver path if needed.
   
5. Run the tests using Maven:
   mvn clean test


## Usage
Here's how to use the project for testing:

1. Clone the repository and set up your local environment.
2. Run the tests using Maven as shown in the installation steps.
3. Review the test reports generated in the target directory.
   
Example command:
mvn test -Dtest=WatchModuleTest

## APIs Used
No external APIs are used in this project. The automation focuses on UI testing of the Watches module.

## API Endpoints
N/A - This project does not involve backend API testing.

## Technology Stack
1. Selenium WebDriver: For browser automation and testing.
2. Java: The programming language used for writing the test scripts.
3. TestNG: For test execution, structuring, and reporting.
4. Maven: For dependency management and build automation.
5. Page Object Model (POM): For structuring test code and maintaining test scripts.
