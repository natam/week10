package org.afternoon_classes.day_1;

public class BankAccount {
    private double balance;

    private Customer customer;

    public BankAccount(double balance, Customer customer){
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
