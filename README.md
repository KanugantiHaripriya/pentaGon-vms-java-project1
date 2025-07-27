# Vehicle Management System - Java Project1

## 🎯 Objective
Design a simple **Vehicle Management System** in Java demonstrating key OOP concepts such as:
- Encapsulation
- Inheritance
- Method Overriding
- Upcasting
- Downcasting

---

## ✅ Requirements

### 1. 🔒 Encapsulation
- Create a **base class `Vehicle`** with private fields:
  - `brand` (String)
  - `speed` (int)
- Provide **public getter and setter methods** for these fields.

---

### 2. 🧬 Inheritance
Create two subclasses extending the `Vehicle` class:

- **Car**  
  - Additional field: `fuelType` (String)

- **Bike**  
  - Additional field: `engineCC` (int)

---

### 3. 🔁 Method Overriding
- Override the `showDetails()` method in both `Car` and `Bike` classes to provide specific vehicle details.

---

### 4. 🔼🔽 Upcasting and Downcasting

- **Upcasting:**  
  Assign `Car` and `Bike` objects to `Vehicle` type references.

- **Downcasting:**  
  Convert `Vehicle` references back to `Car` and `Bike` to access subclass-specific properties.

---

## 🛠️ Technologies Used
- Java (OOP Concepts)

---

## 💻 Sample Output
Car fuel Type is : petrol  
Bike engine cc is : 1000  
Brand is : Range Rover  
Speed is : 1000  
Brand is : BMW  
Speed is : 1000


