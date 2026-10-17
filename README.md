# Java OOP Practice

A beginner-friendly reference for the four core principles of object-oriented programming (OOP) in Java.

## 1. Encapsulation

Keep data and the methods that operate on it together, and control access to internal state.

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

## 2. Inheritance

Create a class from an existing class to reuse and extend behavior.

```java
class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking"); }
}
```

## 3. Polymorphism

Use a common parent type or interface while allowing different implementations to respond in their own way.

```java
class Animal {
    void sound() { System.out.println("Some sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Woof"); }
}
```

## 4. Abstraction

Expose what an object does while hiding the details of how it does it, often with interfaces or abstract classes.

```java
interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}
```

## Quick recap

| Principle | Main idea |
|---|---|
| Encapsulation | Protect and manage internal state |
| Inheritance | Reuse and extend existing behavior |
| Polymorphism | One interface, different implementations |
| Abstraction | Show essentials, hide implementation details |

These are small illustrative examples for practice. Compile and run them in separate Java files/classes as needed.
