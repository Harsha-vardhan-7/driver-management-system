# Driver Management System

## Overview

Driver Management System is a console-based Java application that manages driver records and performs business operations using Core Java and the Collections Framework.

The project demonstrates Object-Oriented Programming principles and collection-based data handling by modeling a real-world driver management scenario.

---

## Problem Statement

Thomas Travels aims to automate its driver management process.

Each driver contains:

- Driver ID
- Driver Name
- Driver Category (Auto / Car / Lorry)
- Total Distance Traveled (in KM)

The system performs operations such as searching, filtering, counting, and identifying maximum values using collection-based logic.

---

## Key Features

- Check whether a driver belongs to the Car category
- Retrieve driver details by ID
- Count drivers belonging to a specific category
- Retrieve drivers filtered by category
- Identify the driver who has traveled the maximum distance
- Perform collection-based search operations with O(n) time complexity

---

## Technologies & Concepts Used

- Java (Core Java)
- Object-Oriented Programming (Encapsulation)
- Java Collections Framework (ArrayList)
- Conditional statements and loops
- Method-based business logic design
- Basic time complexity awareness

---

## Project Structure
```
driver-management-system/
│
├── src/
│   └── com/
│       ├── Driver.java
│       ├── Travel.java
│       └── TestDriver.java
│
├── README.md
└── .gitignore
```
---

## How the Application Works

1. Driver objects are created with predefined data.
2. Driver records are stored in an `ArrayList`.
3. Business logic is implemented inside the `Travel` class.
4. The `TestDriver` class invokes service methods and prints results in the console.

---

## Core Service Methods

- `isCarDriver(Driver driver)`
- `retrieveByDriverId(ArrayList<Driver>, int driverId)`
- `retrieveCountOfDriver(ArrayList<Driver>, String category)`
- `retrieveDriver(ArrayList<Driver>, String category)`
- `retrieveMaximumDistanceTravelledDriver(ArrayList<Driver>)`

---

## Key Learnings

- Designing clean model and service classes
- Applying OOP principles to simulate real-world systems
- Implementing collection-based retrieval and filtering logic
- Structuring modular and maintainable Java applications
- Managing project structure using Git

---

## How to Run

1. Clone the repository
2. Open the project in Eclipse or IntelliJ IDEA
3. Ensure JDK 17 (or compatible version) is configured
4. Run the `TestDriver` class
5. Observe the output in the console

---

## Author

Harsha Vardhan  
Java Developer | Backend-Focused | Core Java | Collections | SQL (Learning)
