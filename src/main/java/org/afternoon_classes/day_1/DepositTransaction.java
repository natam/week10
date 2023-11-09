package org.afternoon_classes.day_1;

public class DepositTransaction implements Transaction{
    BankAccount bankAccount;
    double transactionAmount;

    public DepositTransaction(BankAccount account, double transactionAmount){
        this.transactionAmount = transactionAmount;
        this.bankAccount = account;
    }
    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public void doTransaction() {
        System.out.println("Deposit :" + transactionAmount);
        bankAccount.setBalance(bankAccount.getBalance()+transactionAmount);
    }
}
