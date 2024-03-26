package com.task4;


               // Custom exception class for age not within range
	class AgeNotWithinRangeException extends Exception {
	    public AgeNotWithinRangeException(String message) {
	        super(message);
	    }
	}

	// Custom exception class for invalid name
	class NameNotValidException extends Exception {
	    public NameNotValidException(String message) {
	        super(message);
	    }
	}

	// Student class
	class Student {
	    private int rollNo;
	    private String name;
	    private int age;
	    private String course;

	    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
	        this.rollNo = rollNo;
	        if (age < 15 || age > 21) {
	            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
	        }
	        this.age = age;
	        if (!isValidName(name)) {
	            throw new NameNotValidException("Name contains numbers or special symbols.");
	        }
	        this.name = name;
	        this.course = course;
	    }

	    private boolean isValidName(String name) {
	        // Check if the name contains only alphabets and spaces
	        return name.matches("[a-zA-Z ]+");
	    }

	    public void displayInfo() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Course: " + course);
	    }
	}

