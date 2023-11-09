package org.afternoon_classes.day_1;

public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Customer customer = new Customer("Natallia");
        BankAccount myAccount = new BankAccount(0.0, customer);
        bankingSystem.transactionsProcessing.addTransaction(new WithdrawTransaction(myAccount, 25.0));
        bankingSystem.transactionsProcessing.addTransaction(new DepositTransaction(myAccount, 225.0));
        bankingSystem.transactionsProcessing.addTransaction(new DepositTransaction(myAccount, 36.0));
        bankingSystem.transactionsProcessing.addTransaction(new WithdrawTransaction(myAccount, 50.0));
        bankingSystem.transactionsProcessing.addTransaction(new DepositTransaction(myAccount, 70.0));
        bankingSystem.transactionsProcessing.addTransaction(new WithdrawTransaction(myAccount, 10.0));
        bankingSystem.transactionsProcessing.addTransaction(new WithdrawTransaction(myAccount, 250.0));
        bankingSystem.transactionsProcessing.addTransaction(new DepositTransaction(myAccount, 500.0));
        bankingSystem.transactionsProcessing.addTransaction(new WithdrawTransaction(myAccount, 125.0));
        bankingSystem.transactionsProcessing.addTransaction(new WithdrawTransaction(myAccount, 25.0));

        bankingSystem.transactionsProcessing.processAllTransactions();
        System.out.println(myAccount.getBalance());
    }
}
