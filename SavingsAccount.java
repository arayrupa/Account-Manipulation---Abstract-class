package com.Day4;

public class SavingsAccount extends Account {
    private double minimumBalance;
    
    public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
        super(accountNumber, customerObj, balance);
        this.minimumBalance = minimumBalance;
    }
    
    public double getMinimumBalance() {
        return minimumBalance;
    }
    
    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.printf("Rs. %.2f debited | Balance: %.2f\n", amount, balance);
            return true;
        }
        else {
            System.out.println("Withdrawal unsuccessful. Insufficient balance.");
            return false;
        }
    }
}
