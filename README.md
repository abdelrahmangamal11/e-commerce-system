#  Fawry E-commerce System (Java SE)

This is a simple simulation of an e-commerce system implemented in **pure Java (Java SE)**, as part of the internship challenge at **Fawry Integrated Systems**.

The project follows **Object-Oriented Programming (OOP)** principles and demonstrates usage of:
- Abstract classes
- Interfaces
- Inheritance & Polymorphism
- Encapsulation
- HashMap for cart logic

---

##  Features

- Products may be:
  - **Expiring** (like Cheese and Biscuits)
  - **Non-expiring** (like TVs and Scratch Cards)
- Some products may require **shipping** and provide:
  - `getWeight()` and `getName()`
- A **Cart** that:
  - Accepts products with specific quantities
  - Prevents adding more than available stock
- A **Checkout** system that:
  - Validates products (availability & expiry)
  - Calculates:
    - Subtotal
    - Shipping fees (based on total weight)
    - Total amount paid
    - Customer's remaining balance
  - Sends shippable items to a `ShippingService`
- Informative output printed in the console

---

##  Sample Console Output
![console screenshot ](screenshot.png)
