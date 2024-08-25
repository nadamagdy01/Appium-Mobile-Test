# Jetflix Mobile Automation 
This README file provides a detailed guide to setting up, running, and understanding the automation scenarios for the Jetflix mobile application using Appium, Java, TestNG, and Maven. The assessment involves verifying the correctness of the movie names and release date filters within the application.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Tools and Technologies](#tools-and-technologies)
3. [Setup and Installation](#setup-and-installation)
4. [Scenario 1: Movie Name Verification](#scenario-1-movie-name-verification)
5. [Scenario 2: Release Date Filter Verification](#scenario-2-release-date-filter-verification)
6. [Deliverables](#deliverables)
Deliverables

## Project Overview

The Jetflix Mobile Automation Assessment consists of two primary scenarios:

1. **Scenario 1**: Ensuring that the movie name displayed on the home screen matches the movie screen.
2. **Scenario 2**: Verifying that the release date filter on the home screen only displays movies with future release dates.

Both scenarios are automated using Appium for mobile automation, Java as the programming language, TestNG as the test framework, and Maven for project management.

## Tools and Technologies

- **Java**: Programming language used to write the test scripts.
- **Appium**: Automation framework for testing mobile applications.
- **TestNG**: Test framework for running and organizing test cases.
- **Maven**: Build automation tool used for project management and dependency management.
- **IntelliJ IDEA**: IDE for writing and running the test scripts.
- **Appium Inspector**: Tool for inspecting and interacting with elements in the mobile application.
- **Vysor**: Tool to mirror and control your mobile device from your computer.
- **Allure**: For generating test reports.

## Setup and Installation

### Prerequisites

- **Java JDK 22** installed on your system.
- **IntelliJ IDEA** with Maven plugin.
- **Appium Desktop** and **Appium Inspector** installed.
- **Android Studio** (for AVD Manager if you are using an emulator).
- **Vysor** installed for mirroring the mobile device.
- **Allure**: Reporting tool for generating detailed test reports.

### Steps

1. **Clone the Repository**:
   ```bash
   git clone [repository-url]

### Step-by-Step Instructions
#### Clone the Repository:

Clone the project repository from the source control platform to your local machine.
bash
Copy code
git clone <https://github.com/nadamagdy01/Appium-Mobile-Test/tree/master>
Setup Project in IntelliJ IDEA:

#### Open IntelliJ IDEA.
Import the project as a Maven project.
Ensure that all necessary dependencies are specified in the pom.xml file and are properly resolved.
Configure Appium:

#### Launch the Appium Server.
Configure the desired capabilities for the Jetflix application in your test scripts.
Ensure that the Appium Server is running on the default port (4723) or configure the port as required.

#### Connect Device using Vysor:

Launch Vysor and connect your mobile device.
Ensure the device is detected and accessible via Vysor.
Appium Inspector:

#### Open Appium Inspector.
Configure the desired capabilities for the Jetflix app.
Inspect the application to generate and verify locator strategies.
Run Tests:

#### Open a terminal or command prompt.
Navigate to the project directory.
Run the tests using Maven:
bash
Copy code
mvn test
Verify Execution:

#### Check the test reports generated in the target/surefire-reports directory.
#### Review the demo video for test execution if available.


# Scenarios
## Scenario 1: Verify Movie Name Consistency
Objective: Ensure that the movie name displayed on the home screen matches the movie name on the movie details screen.
### Steps:
Write a generic method to click on any movie name.
Write a generic method to retrieve the movie name from the screen.
Assert that the retrieved movie name matches the movie name on the details screen.
## Scenario 2: Verify Future Release Date Filter
Objective: Ensure that movies listed after applying the release date filter are in the future.
### Steps:
Click on the menu filter.
Choose the release date filter.
Assert that the listed movies have release dates in the future.

### Running the Appium Server Automatically
To run the Appium Server automatically before executing the tests, you can use a setup script or integrate it into your test suite initialization. Ensure that the server is running and accessible during test execution.

### Deliverables
**Demo Video:** A recorded video demonstrating the execution of the tests.
**Execution Report:** A report generated by TestNG showing the results of the test execution.
**ReadMe File:** Contains the setup, execution steps, and tools used for the automation.
