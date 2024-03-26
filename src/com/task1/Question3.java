package com.task1;

import java.util.Scanner;

//write down the program to reverse the given number?

public class Question3 {
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
              //Getting input from the user

		 System.out.println("Enter the value:");
		 int number=sc.nextInt();
		
		int  reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
		}  

	


