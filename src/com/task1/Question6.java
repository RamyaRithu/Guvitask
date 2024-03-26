package com.task1;

import java.util.Scanner;

//pattern program 

public class Question6 {
	
	 public static void main(String args[])
	  {
	    int rows, i, j, count = 0;
	    Scanner sc = new Scanner(System.in);
	      //getting input
	    System.out.print("Enter the no. of rows: ");
	    rows = sc.nextInt();
	   //using for loop
	    for (i = rows; i >= 1; i--)
	    {
	      for (j = rows; j >= i; j--)
	      {
	        System.out.print(j + " ");
	        count = j;
	      }
	 
	      for (j = (rows - i + 1); j < rows; j++)
	        System.out.print(count + " ");
	 
	      System.out.println();
	    }
	  }


}
