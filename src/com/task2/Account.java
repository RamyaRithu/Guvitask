package com.task2;


public class Account {
    private double balance;

    // Constructor with no arguments
    public Account() {
        this.balance = 0.0; // Initialising balance to zero
    }

    // Constructor with  arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance +amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance-amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    

        
    }

