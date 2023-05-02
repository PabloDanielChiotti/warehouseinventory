# warehouseinventory

```curl --location --request GET 'http://localhost:8080/the-shop/configuration'```

This repository provides an endpoint that will call device configuration service repository (https://github.com/PabloDanielChiotti/deviceconfigurationservice) to get the random temperature of the device.

A shop in London has 2 million IoT tracking devices in the Warehouse Inventory for sale, of which half need configuration to meet UK industry standards. 
A configured device will have a status ACTIVE and an ideal temperature between (0’C to 10’C).
When a device is not configured, the default status is READY and temperature value is -1’C.
Every device has a unique secret seven-digit pin code used for unlocking the device. 
A given device needs to be sent to a Device Configuration Service (DCS) to set the device status ACTIVE and random temperature value between (0 to 10).
The Device Configuration Service does not need a device pin code for the configuration operation. 
The shop can sell a device only if it meets the UK government's industry standard.

Task:
Using the Java programming language, develop a solution for the London shop as described above.
Provide a sequence diagram to illustrate interaction between the two Microservices (Warehouse Inventory and Device Configuration Service).
Provide an API Specification for at least one of the developed Microservices.
Open API specification in JSON or YAML format is expected.
Develop a REST API for the Warehouse Inventory to
Add, update, or remove a device
Return all devices available for sale in numerical order of their seven-digit pin code.
Develop the Device Configuration Service and provide an endpoint responsible for configuring a device.
Provide comprehensive Unit and Integration tests for 
All database repositories where applicable,
All communicating API and endpoints. 
Hint:
Clean Code: Please consider your approach to clean code. We care about maintainable, efficient and readable code.
Code Quality: Consider using a static code analyser such as SonarQube or Sonarlint to check for code qualities.
Unit and Integration Testing: Consider using in-memory database or TestContainers for database related tests and Mockservers for simulating external APIs.
Test Coverage: Consider using JaCoCo or any test coverage tool to ensure that test coverage for Lines, Methods, and Branches are not less than 80% coverage.
Framework: We use the Spring Boot / Spring framework. However, you are free to use any framework of your choice.
Persistence: You are free to use a relational or NoSQL database in your design; however, ensure that you provide all necessary scripts required to set up and run the developed solution.
Files: Please provide all files that will be required to build, test, or run the developed solution with step-by-step guide on building and running the application in a README file.
Data Format: The expected API response should be in JSON format.
