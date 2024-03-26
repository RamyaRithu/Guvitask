package com.task4;
import java.util.HashMap;
import java.util.Map;


public class StudentGrades {
	
	
	    private Map<String, Integer> studentGrades;

	    public StudentGrades() {
	        studentGrades = new HashMap<>();
	    }

	    // Method to add a new student with name and grade
	    public void addStudent(String name, int grade) {
	        studentGrades.put(name, grade);
	        System.out.println("Student '" + name + "' with grade " + grade + " added successfully.");
	    }

	    // Method to remove a student by name
	    public void removeStudent(String name) {
	        if (studentGrades.containsKey(name)) {
	            studentGrades.remove(name);
	            System.out.println("Student '" + name + "' removed successfully.");
	        } else {
	            System.out.println("Student '" + name + "' not found.");
	        }
	    }

	    // Method to display a student's grade by name
	    public void displayGrade(String name) {
	        if (studentGrades.containsKey(name)) {
	            System.out.println("Grade of student '" + name + "' is " + studentGrades.get(name));
	        } else {
	            System.out.println("Student '" + name + "' not found.");
	        }
	    }

	    public static void main(String[] args) {
	        StudentGrades studentGrades = new StudentGrades();

	        // Adding students
	        studentGrades.addStudent("Ramya", 85);
	        studentGrades.addStudent("velu", 70);
	        studentGrades.addStudent("Rithu", 90);

	        // Displaying grades
	        studentGrades.displayGrade("Ramya");
	        studentGrades.displayGrade("velu");
	        studentGrades.displayGrade("Rithu");

	        // Removing a student
	        studentGrades.removeStudent("velu");

	        // Displaying grade after removal
	        studentGrades.displayGrade("Velu");
	    }
	}




