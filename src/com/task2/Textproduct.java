package com.task2;

import java.util.Scanner;

public class Textproduct {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept five product information from user and store in an array
	        Product[] products = new Product[5];
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter product ID:");
	            int pid = scanner.nextInt();
	            System.out.println("Enter price:");
	            double price = scanner.nextDouble();
	            System.out.println("Enter quantity:");
	            int quantity = scanner.nextInt();

	            // Create Product object and store in the array
	        }

	        // Find Pid of the product with the highest price
	        int maxPricePid = findMaxPricePid(products);
	        System.out.println("Pid of the product with the highest price: " + maxPricePid);

	        // Calculate and return the total amount spent on all products
	        double totalAmountSpent = calculateTotalAmountSpent(products);
	        System.out.println("Total amount spent on all products: " + totalAmountSpent);

	        scanner.close();
	    }

	    // Method to find Pid of the product with the highest price
	    private static int findMaxPricePid(Product[] products) {
	        int maxPricePid = -1;
	        double maxPrice = Double.MIN_VALUE;

	        for (Product product : products) {
	            if (product.price > maxPrice) {
	                maxPrice = product.price;
	                maxPricePid = product.pid;
	            }
	        }

	        return maxPricePid;
	    }

	    // Method to calculate and return the total amount spent on all products
	    private static double calculateTotalAmountSpent(Product[] products) {
	        double totalAmountSpent = 0;

	        for (Product product : products) {
	            totalAmountSpent += product.price * product.quantity;
	        }

	        return totalAmountSpent;
	    }
	

}



