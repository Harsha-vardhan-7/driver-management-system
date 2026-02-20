# Thomas Travel Driver Management System

## Overview
Thomas Travel Driver Management System is a **console-based Core Java application** focused on managing driver information and performing operations using **Object-Oriented Programming and Java Collections**.

The purpose of this project is to practice **Core Java, OOP principles, and Java Collections-based logic** by modeling a real-world driver management scenario.

---

## Problem Statement
Thomas Travels wants to automate their driver management process.

Each driver has the following attributes:
1. Driver ID  
2. Driver Name  
3. Driver Category (Auto / Car / Lorry)  
4. Total distance traveled  

The application performs various operations on driver data such as searching, filtering, counting, and identifying maximum values.

---

## Functional Requirements
The `Travel` service class provides the following functionalities:

- **isCarDriver(Driver driver)**  
  - Checks whether the given driver belongs to the `Car` category.

- **retrieveByDriverId(ArrayList<Driver> drivers, int driverId)**  
  - Searches for a driver by ID and returns details in the format:  
    ```
    Driver name is <driverName> belonging to the category <category> traveled <totalDistance> KM so far.
    ```

- **retrieveCountOfDrivers(ArrayList<Driver> drivers, String category)**  
  - Returns the count of drivers belonging to a given category.

- **retrieveDriversByCategory(ArrayList<Driver> drivers, String category)**  
  - Returns a list of drivers belonging to the specified category.

- **retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers)**  
  - Returns the driver who has traveled the maximum distance.

---

## Technologies & Concepts Used
- **Language:** Java  
- **Concepts:**
  - Object-Oriented Programming (Encapsulation, Inheritance, Polymorphism)
  - Classes and Objects
  - Constructors and Methods
  - Java Collections (`ArrayList`)
  - Conditional statements and loops
  - Searching and filtering logic
  - Scanner for input handling

---

## Project Structure
```
project-01-thomas-travels/
│
├── src/
│   └── com/
│       └── thomastravels/
│           ├── model/
│           │   └── Driver.java
│           │
│           ├── service/
│           │   └── Travel.java
│           │
│           └── main/
│               └── TestDriver.java
│
└── README.md
```
---

## How the Application Works
1. Driver objects are created with predefined data  
2. Driver information is stored in an `ArrayList`  
3. Service methods are invoked from the `TestDriver` class  
4. Each method performs a specific operation and displays results in the console  

---

## What I Learned
- Designing entity and service classes properly
- Applying OOP principles in real-world scenarios
- Working with `ArrayList` and collection-based logic
- Writing reusable and testable business methods
- Separating data, logic, and execution flow

---

## Limitations
- Console-based application
- Data stored in memory (no database)
- No UI layer

These limitations are intentional to focus on **Core Java and logic building**.

---

## Scope Note
This project is intentionally limited to Core Java and Collections
and was built as a learning exercise. No further enhancements are planned.

---

## How to Run
1. Clone the repository
2. Open the project in Eclipse or IntelliJ IDEA
3. Run the `TestDriver` class
4. Observe the output in the console

---

## Author
Harsha Vardhan Chundru  
Core Java | OOP | Java Collections
