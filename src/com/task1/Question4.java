package com.task1;

import java.util.Scanner;

//find the smallest number among three numbers


public class Question4 {
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
              //Getting input from the user

	    System.out.println("Enter the number1:");
		 int num1=sc.nextInt();
		 System.out.println("Enter the number2:");
		 int num2=sc.nextInt();
		 System.out.println("Enter the number3:");
		 int num3=sc.nextInt();
		
		int smallest;
		// checking the condition comparing the value find the smallest one
	     if(num1<num2) {
	            if(num3<num1) {
	                smallest = num3;
	            } else {
	                smallest = num1;
	            }
	        } else {
	            if(num2<num3) {
	                smallest = num2;
	            } else {
	                smallest = num3;
	            }
	        }
	         
	        System.out.println(smallest + " is the smallest.");
	    }


}
