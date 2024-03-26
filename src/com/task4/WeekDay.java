package com.task4;

import java.util.Scanner;

public class WeekDay {
	
	

	
	    public static void main(String[] args) {
	        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the day position (0-6): ");
	        int dayIndex = scanner.nextInt();

	        try {
	            String dayName = getDayName(weekdays, dayIndex);
	            System.out.println("Day name: " + dayName);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Day index is outside the range (0-6).");
	        }
	    }

	    public static String getDayName(String[] weekdays, int dayIndex) {
	        return weekdays[dayIndex];
	    }
	}



