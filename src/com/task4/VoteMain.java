package com.task4;

public class VoteMain {
	
	    public static void main(String[] args) {
	        try {
	            // Creating a voter with valid age
	            Voter voter1 = new Voter(1001, "Ramya", 25);
	            voter1.displayInfo();

	            // Creating a voter with invalid age
	            Voter voter2 = new Voter(1002, "Rithu", 16);
	            voter2.displayInfo(); // This won't execute due to exception

	        } catch (InvalidAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


