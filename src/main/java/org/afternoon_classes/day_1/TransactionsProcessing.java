package org.afternoon_classes.day_1;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionsProcessing {
    ArrayDeque transactions;

    public TransactionsProcessing() {
        transactions = new ArrayDeque<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void removeTransaction(Transaction transaction) {
        transactions.remove(transaction);
    }

    public void processTransaction() {
        ExecutorService executor = Executors.newFixedThreadPool(20);
        if (!transactions.isEmpty()) {
            Transaction transaction = (Transaction) transactions.pop();
            executor.submit(transaction);
        }
        executor.shutdown();
    }

    public void processAllTransactions() {
        ExecutorService executor = Executors.newFixedThreadPool(20);
        while (!transactions.isEmpty()) {
            Transaction transaction = (Transaction) transactions.pop();
            executor.submit(transaction);
        }
        executor.shutdown();
    }
}
