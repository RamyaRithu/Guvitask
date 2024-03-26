package com.task2;

/*Create a class Person with properties (name and age) with following features.
a.	Default age of person should be 18;
b.	A person object can be initialised with name and age;
c.	Method to display name and age of person*/


public class Person1 {
	
	public String name;
    public int age;

    // Constructor with default age
    public Person1(String name) {
        this.name = name;
        this.age = 18; // Default age
    }

    // Constructor with specified name and age
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects of Person class
        Person1 p = new Person1("Ramya");
        p.display();
        
        
    }
}



