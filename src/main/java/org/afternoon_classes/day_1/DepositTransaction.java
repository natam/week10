package org.afternoon_classes.day_1;

public class DepositTransaction extends Transaction implements Depositable, Runnable {
    public DepositTransaction(BankAccount account, double transactionAmount){
        super(account, transactionAmount);
    }
    @Override
    public void depositMoney() {
        System.out.println("Deposit :" + transactionAmount);
        bankAccount.setBalance(bankAccount.getBalance()+transactionAmount);
    }

    @Override
    public void run() {
        depositMoney();
    }
}
