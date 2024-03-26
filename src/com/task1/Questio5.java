package com.task1;

import java.util.Scanner;

/*Write the java program that take the purchase amount as input and calculate final payable
•	If purchase amount is less than 500 there is no discount applied
•	If the purchase amount between 500 to 1000, 10% discount applied
•	If the purchase amount is greater than 1000, 20% applied */

public class Questio5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //getting input
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double finalPayableAmount = 0;
           //checking the condition 
        if (purchaseAmount < 500) {
            finalPayableAmount = purchaseAmount;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            finalPayableAmount = purchaseAmount - (purchaseAmount * 0.1);
        } else {
            finalPayableAmount = purchaseAmount - (purchaseAmount * 0.2);
        }
           //print final payable amount
        System.out.println("Final payable amount: $" + finalPayableAmount);

        scanner.close();
    }

	
	

}
