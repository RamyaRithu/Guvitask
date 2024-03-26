package com.task4;


	// Custom checked exception class for invalid age
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	// Voter class
	class Voter {
	    private int voterID;
	    private String name;
	    private int age;

	    public Voter(int voterID, String name, int age) throws InvalidAgeException {
	        this.voterID = voterID;
	        this.name = name;
	        if (age < 18) {
	            throw new InvalidAgeException("Invalid age for voter " + name);
	        }
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Voter ID: " + voterID);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}


