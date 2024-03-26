package com.task4;


public class Main {
    public static void main(String[] args) {
        try {
            // Creating a student with valid information
            Student student1 = new Student(101, "Ramya", 20, "Computer Science");
            student1.displayInfo();

            // Creating a student with invalid age
            Student student2 = new Student(102, "velu", 25, "Mathematics");
            student2.displayInfo(); // This won't execute due to exception

        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}