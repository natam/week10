package org.afternoon_classes.day_1;

public class WithdrawTransaction extends Transaction implements Withdrawable, Runnable{

    public WithdrawTransaction(BankAccount account, double transactionAmount){
        super(account, transactionAmount);
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdraw :" + transactionAmount);
        if(bankAccount.getBalance()>=transactionAmount) {
            bankAccount.setBalance(bankAccount.getBalance() - transactionAmount);
        }else {
            System.out.println("Not enough money on your balance");
        }
    }

    @Override
    public void run() {
        withdrawMoney();
    }
}
