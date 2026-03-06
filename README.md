# Driver Management System (Java 8 Streams)

## Overview
The Driver Management System is a simple Java application that demonstrates the use of the **Java 8 Stream API** to perform operations on driver data.

The project focuses on filtering, searching, counting, and finding drivers based on different conditions using **Streams, Lambda Expressions, Comparator, and Collectors**.

This project was built to strengthen understanding of **Java 8 functional programming concepts while working with collections**.

---

## Features

The application performs the following operations on a list of drivers:

- Check whether a driver belongs to the **Car category**
- Retrieve driver details using **Driver ID**
- Count drivers belonging to a specific **category**
- Retrieve all drivers belonging to a specific **category**
- Find the driver who has travelled the **maximum distance**

---

## Technologies Used

- Java 8
- Stream API
- Lambda Expressions
- Comparator
- Collections Framework (ArrayList)
- Object-Oriented Programming (OOP)

---

## Project Structure
```
DriverManagementSystem
src  
└── com  
  ├── Driver.java  
  ├── Travel.java  
  └── TestDriver.java  
```
**Driver.java**  
Represents the Driver entity containing driver details.

**Travel.java**  
Contains the business logic implemented using Java 8 Streams.

**TestDriver.java**  
Used to test and demonstrate all the functionalities of the system.

---

## Driver Entity

Each driver contains the following attributes:

- **driverId** – Unique identifier for the driver  
- **driverName** – Name of the driver  
- **category** – Vehicle category (Car, Auto, Lorry)  
- **totalDistance** – Total distance travelled by the driver  

---

## Methods Implemented

### isCarDriver()
Checks whether a driver belongs to the **Car category**.

### retrieveByDriverId()
Finds and returns driver details based on the given **Driver ID**.

### retrieveCountOfDriver()
Counts the number of drivers belonging to a specific **category**.

### retrieveDriver()
Retrieves all drivers belonging to a given **category**.

### retrieveMaximumDistanceTravelledDriver()
Returns the driver who has travelled the **maximum distance**.

---

## Example Output

true  
false  
true  

Driver name is Harsha belonging to category car traveled 20000.0 KM so far.

Count of Auto drivers: 3

Drivers belonging to Auto category:

Driver id is: 3, Driver name is: Dora, category: Auto, traveled: 100000 KM so far  
Driver id is: 5, Driver name is: Kamalhasan, category: Auto, traveled: 20000 KM so far  
Driver id is: 6, Driver name is: Rajinikanth, category: Auto, traveled: 10000 KM so far  

Driver with maximum distance travelled:

Driver id is: 7, Driver name is: Karthik, category: Lorry, traveled: 1000000 KM so far

---

## Concepts Demonstrated

- Java 8 Stream API
- Lambda Expressions
- Comparator with Streams
- Collectors
- Filtering and transforming data using streams
- Object-Oriented Programming
- Working with Java Collections

---

## Requirements

- Java 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

---

## How to Run

1. Clone the repository
```
  git clone https://github.com/your-username/driver-management-java8.git
```
2. Open the project in your preferred Java IDE.

3. Navigate to the **TestDriver** class.

4. Run the **main()** method to execute the program.

---

## Learning Outcomes

This project demonstrates:

- Practical usage of **Java 8 Stream API**
- Writing **clean and functional-style Java code**
- Applying **streams to perform real-world data processing**
- Combining **OOP concepts with modern Java features**

---

## Author
Harsha Vardhan Chundru
