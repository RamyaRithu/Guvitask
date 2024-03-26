package com.task3;

public class DriverMain {
	public static void main(String[] args) {
        // Creating employee object
        Employee employee = new Employee(1, "Ramya", 50000.0);

        // Creating product object
        Product product = new Product(101, 10.0, 5);

        // Printing income tax and sales tax respectively
        System.out.println("Income Tax for Employee " + employee.name + ": $" + employee.calcTax());
        System.out.println("Sales Tax for Product: $" + product.calcTax());
    }
}


