package org.afternoon_classes.day_1;

public class WithdrawTransaction implements Transaction{
    BankAccount bankAccount;
    double transactionAmount;

    public WithdrawTransaction(BankAccount account, double transactionAmount){
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
        System.out.println("Withdraw :" + transactionAmount);
        if(bankAccount.getBalance()>=transactionAmount) {
            bankAccount.setBalance(bankAccount.getBalance() - transactionAmount);
        }else {
            System.out.println("Not enough money on your balance");
        }
    }
}
