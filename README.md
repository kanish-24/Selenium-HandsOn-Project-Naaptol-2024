# Selenium Hands-On
# Jewellery Module Automation with CucumberTestNG

## Introduction
This project focuses on automating the Jewellery module using Selenium and Cucumber with TestNG.
The main purpose is to ensure robust, efficient, and reliable test automation for the Jewellery module, 
which includes functionalities like browsing products, adding to the cart, and completing purchases. 
This automation project aims to streamline the testing process, reduce manual effort, 
and ensure high-quality releases by catching bugs early in the development cycle.

## Project Type
Selenium Automation | Automation Testing

## Directory Structure
jewellery-automation/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  ├─ stepDefinitions/
│  │  │  ├─ runners/
│  │  │  ├─ pageObjects/
│  ├─ test/
│  │  ├─ java/
│  │  │  ├─ features/
│  │  │  ├─ resources/
├─ pom.xml

## Video Walkthrough of the project
Attach a very short video walkthough of all of the features [ 1 - 3 minutes ]

## Video Walkthrough of the codebase
Attach a very short video walkthough of codebase [ 1 - 5 minutes ]

## Features
List out the key features of your application.

- Browse jewellery products by category.
- Add products to the shopping cart.
- Complete the purchase process with various payment options.
- Automated test scenarios for each functionality using Cucumber.
- Integration with TestNG for test execution and reporting.


## design decisions or assumptions

- Tests are written in Gherkin syntax for better readability and maintenance.
- Cucumber is used for behavior-driven development (BDD) to make scenarios understandable for non-technical stakeholders.
- TestNG is chosen for its ability to manage test cases and generate comprehensive reports.
- Page Object Model (POM) is implemented to separate UI actions from test logic.

## Installation & Getting started
Follow the steps below to install and run the project:

bash:
# Clone the repository
git clone https://github.com/kanish-24/Selenium-HandsOn-Project-Naaptol-2024

# Navigate to the project directory
cd jewellery-automation

# Install dependencies
mvn clean install

# Run the tests
mvn test

## Usage
To run the test suite, use the following command:

# Execute all Cucumber tests
mvn clean test -Dcucumber.options="--tags @regression"

# Example of running a specific feature file
mvn clean test -Dcucumber.options="src/test/resources/features/your-feature.feature"

## APIs Used
The project does not rely on external APIs. It focuses solely on UI testing through Selenium WebDriver.

## API Endpoints
Not applicable as this is a front-end automation project using Selenium WebDriver.

## Technology Stack
- Selenium WebDriver: For browser automation.
- Cucumber: For behavior-driven development (BDD) with Gherkin.
- TestNG: For test execution and reporting.
- Java: The programming language used for automation scripts.
- Maven: For build and dependency management.
