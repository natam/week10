package org.afternoon_classes.day_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BankingSystem {
    List<BankAccount> bankAccounts;
    TransactionsProcessing transactionsProcessing;

    public BankingSystem(){
        transactionsProcessing = new TransactionsProcessing();
        bankAccounts = new ArrayList<>();
    }
}
