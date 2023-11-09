package org.afternoon_classes.day_1;

public class GetBalance implements Transaction{
    BankAccount bankAccount;

    public GetBalance(BankAccount account){
        this.bankAccount = account;
    }
    @Override
    public void doTransaction() {
        System.out.println(bankAccount.getBalance());
    }
}
