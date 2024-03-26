package com.task1;

import java.util.Scanner;

//write a program to find the given number is positive or negative

public class Question2 {
	public static void main(String args[])
	{
		
		 Scanner sc=new Scanner(System.in);
                   //Getting input from the user
		 System.out.println("Enter the value:");
		 int number=sc.nextInt();
		 
		 //using if to check the condition
		 if(number>0) {
			 
			 System.out.println("The number is positive");
			 
			 }
		 else {
			 System.out.println("The number is negative");
		 }
		    
		      
		    }  
		}  

	
	


