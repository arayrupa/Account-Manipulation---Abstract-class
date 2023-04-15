package com.Day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter A/C number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("enter customer id: ");
        int customerId = sc.nextInt();
        
        sc.nextLine(); // Consume newline left-over
        
        System.out.print("enter customer name: ");
        String customerName = sc.nextLine();
        
        System.out.print("enter customer email: ");
        String emailId = sc.nextLine();
        
        System.out.print("enter balance: ");
        double balance = sc.nextDouble();
        
        System.out.print("enter minimum balance: ");
        double minimumBalance = sc.nextDouble();
        
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, new Customer(customerId, customerName, emailId), balance, minimumBalance);
        
        System.out.print("\nenter amount to withdraw: ");
        double amount = sc.nextDouble();
        savingsAccount.withdraw(amount);
        
        sc.close();
    }
}

