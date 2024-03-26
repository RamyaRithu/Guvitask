package com.task3;

public interface Taxable {

	
	double salesTax = 0.07; // 7%
    double incomeTax = 0.105; // 10.5%

    double calcTax(); // Abstract method
}

// Class Employee implementing Taxable
class Employee implements Taxable {
    private int empId;
    String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implementing abstract method to calculate income tax on yearly salary
    @Override
    public double calcTax() {
        return salary * incomeTax;
    }
}

// Class Product implementing Taxable
class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implementing abstract method to calculate sales tax on unit price of product
    @Override
    public double calcTax() {
        return price * quantity * salesTax;
    }
}


