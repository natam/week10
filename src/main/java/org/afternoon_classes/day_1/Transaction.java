package org.afternoon_classes.day_1;

abstract class Transaction implements Runnable{
    BankAccount bankAccount;
    double transactionAmount;

    public Transaction(BankAccount account, double transactionAmount){
        this.transactionAmount = transactionAmount;
        this.bankAccount = account;
    }
    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
