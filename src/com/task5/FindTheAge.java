package com.task5;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class FindTheAge {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
	        String birthdateInput = scanner.nextLine();

	        // Parse the birthdate input into a LocalDate object
	        LocalDate birthdate = LocalDate.parse(birthdateInput);

	        // Get the current date
	        LocalDate currentDate = LocalDate.now();

	        // Calculate the period between the birthdate and current date
	        Period period = Period.between(birthdate, currentDate);

	        // Get the years, months, and days from the period
	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();

	        // Print the age
	        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
	    }
	}


