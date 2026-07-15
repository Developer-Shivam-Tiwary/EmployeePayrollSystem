# Employee Payroll Management System

A Java-based console application that manages employee records and automates payroll calculations. The system allows users to add, update, search, and delete employee records while calculating gross salary, net salary, and generating formatted salary slips.

This project demonstrates the implementation of **Object-Oriented Programming (OOP)** concepts, **Collections Framework**, **Exception Handling**, and **modular application design** using Core Java.

---

## 🚀 Features

### Employee Management

- Add a new employee
- View all employees
- Search employee by ID
- Update employee details
- Delete employee records
- Prevent duplicate Employee IDs

---

### Payroll Management

- Calculate HRA
- Calculate DA
- Calculate Bonus
- Calculate Gross Salary
- Calculate Tax
- Calculate Provident Fund (PF)
- Calculate Net Salary
- Generate formatted Salary Slip

---

## 🛠️ Technologies Used

- Java (Core Java)
- Object-Oriented Programming (OOP)
- Java Collections Framework (ArrayList)
- Exception Handling
- Java Scanner (User Input)
- Java Formatting (`printf`)
- IntelliJ IDEA / VS Code

---

## 📂 Project Structure

```
EmployeePayrollSystem
│
├── Employee.java
├── EmployeeManager.java
├── SalaryCalculator.java
└── Main.java
```

---

## 📖 Project Explanation

The Employee Payroll Management System is a menu-driven console application where employee information is stored in memory using an **ArrayList**.

Each employee contains:

- Employee ID
- Name
- Department
- Basic Salary

The application provides CRUD (Create, Read, Update, Delete) operations for employee records along with automatic payroll calculations.

---

## 🏗️ Class Overview

### Employee.java

Represents an employee using encapsulation.

**Attributes**

- Employee ID
- Name
- Department
- Basic Salary

**Responsibilities**

- Store employee information
- Provide getters and setters
- Override `toString()` for readable output

---

### EmployeeManager.java

Handles all employee management operations.

Functions include:

- Add Employee
- View Employees
- Search by ID
- Update Employee
- Delete Employee
- Duplicate ID Validation

Employee records are stored using an **ArrayList<Employee>**.

---

### SalaryCalculator.java

Responsible for payroll calculations.

The application calculates:

| Component | Percentage |
|-----------|-----------:|
| HRA | 20% |
| DA | 10% |
| Bonus | 5% |
| Tax | 5% |
| PF | 8% |

### Salary Formula

```
Gross Salary
= Basic Salary
+ HRA
+ DA
+ Bonus
```

```
Net Salary
= Gross Salary
− Tax
− PF
```

It also generates a formatted salary slip.

---

### Main.java

Acts as the entry point of the application.

Provides a menu-driven interface for users to perform payroll operations.

Menu Options:

```
1. Add Employee
2. View All Employees
3. Search Employee
4. Update Employee
5. Delete Employee
6. Calculate Salary
7. Generate Salary Slip
8. Exit
```

---

## ⚙️ How the System Works

```
User
   │
   ▼
Menu Driven Interface
   │
Select Operation
   │
   ▼
Employee Manager
   │
Stores Employee Objects
(ArrayList)
   │
   ▼
Salary Calculator
   │
Calculates Payroll
   │
   ▼
Displays Results
```

---

## 📋 Payroll Workflow

```
Create Employee
        │
        ▼
Store Employee
(ArrayList)
        │
        ▼
Select Payroll Option
        │
        ▼
Calculate Salary Components
        │
        ▼
Gross Salary
        │
        ▼
Tax & PF Deduction
        │
        ▼
Net Salary
        │
        ▼
Generate Salary Slip
```

---

## 💡 Object-Oriented Programming Concepts Used

- Encapsulation
- Classes & Objects
- Constructors
- Getter & Setter Methods
- Method Overloading
- Method Overriding (`toString()`)
- Object Composition
- Modular Programming

---

## 📌 Java Concepts Demonstrated

- Core Java
- Collections Framework
- ArrayList
- Exception Handling
- Input Validation
- Loops
- Conditional Statements
- Modular Design
- Scanner Class
- Formatted Output

---

## ▶️ How to Run

### Clone the Repository

```bash
git clone https://github.com/Developer-Shivam-Tiwary/EmployeePayrollSystem.git
```

### Navigate to Project

```bash
cd EmployeePayrollSystem
```

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## 📷 Sample Output

```
==== Employee Payroll Management System ====

1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Update Employee
5. Delete Employee
6. Calculate Salary
7. Generate Salary Slip
8. Exit

Enter your choice:
```

Example Salary Slip

```
==========================================
             SALARY SLIP
==========================================
Employee ID   : 101
Name          : Shivam Tiwary
Department    : IT

Basic Salary  : 50000.00
HRA (20%)     : 10000.00
DA (10%)      : 5000.00
Bonus (5%)    : 2500.00

Gross Salary  : 67500.00

Tax (5%)      : 3375.00
PF (8%)       : 5400.00

NET SALARY    : 58725.00
==========================================
```

---

## 🚀 Future Enhancements

- MySQL Database Integration
- JDBC Support
- Employee Login System
- Admin Authentication
- File-Based Data Storage
- GUI using Java Swing or JavaFX
- PDF Salary Slip Generation
- Attendance Management
- Leave Management
- Payroll Reports
- Export to Excel
- REST API using Spring Boot

---

## 👨‍💻 Author

**Shivam Tiwary**

Master of Computer Applications (MCA)  
Noida Institute of Engineering and Technology (NIET), Greater Noida

- GitHub: https://github.com/Developer-Shivam-Tiwary
- Email: shivamtiwaryniet@gmail.com

---

## ⭐ Support

If you found this project helpful, consider giving it a **⭐ Star** on GitHub. It helps others discover the project and supports future improvements.
