#  Fawry E-commerce System (Java SE)

This is a simple simulation of an e-commerce system implemented in **pure Java (Java SE)**, as part of the internship challenge at **Fawry Integrated Systems**.

The project follows **Object-Oriented Programming (OOP)** principles and demonstrates usage of:
- Abstract classes
- Interfaces
- Inheritance & Polymorphism
- Encapsulation
- HashMap for cart logic

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



##  How to Run

1. Clone the repo or copy the source files into your Java IDE (e.g., IntelliJ Community).
2. Make sure you have a `Main.java` class to test different product and cart scenarios.
3. Run the `Main` class and observe the printed output in the console.


##  Sample Console Output

![image alt](https://github.com/abdelrahmangamal11/e-commerce-system/blob/master/Screenshot%202025-07-04%20202558.png?raw=true
)



##  Technologies Used

- Java SE (no frameworks)
- OOP Design Principles



