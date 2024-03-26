package com.task2;

public class Person {
	
	//Base class Person
	
	 String name;
	 int age;

	 // Constructor
	 public Person(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }
	}

	//Subclass Employee inheriting from Person
	class Employee extends Person {
	 int employeeID;
	 double salary;

	 // Constructor
	 public Employee(String name, int age, int employeeID, double salary) {
	     super(name, age); // Initialize Person attributes using super keyword
	     this.employeeID = employeeID;
	     this.salary = salary;
	 }


}
