package org.example;

import java.text.SimpleDateFormat;
import java.util.*;

public class Account implements AccountService{

    private int balance;
    private List<Operation> operations;

    // create a formatter
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");


    public Account() {
        this.balance = 0;
        this.operations = new ArrayList<>();
    }

    @Override
    public void deposit(int amount) {
        Operation operation = new Operation(new Date(), "deposit", amount, this.balance+amount);
        this.operations.add(operation);
        this.balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient balance");
            return;
        }
        Operation operation = new Operation(new Date(), "withdraw", amount, this.balance-amount);
        this.operations.add(operation);
        this.balance -= amount;
    }

    @Override
    public void printStatement() {
        // in case no operations, we could show a kind message !

        // sort operations
        List<Operation> sortedOperations = operations.stream()
                .sorted(Comparator.comparing(Operation::getOperationDate).reversed())
                .toList();

        System.out.println("Date       || Amount || Balance");
        for (Operation operation : sortedOperations) {
            this.printOperation(operation);
        }
    }

    private void printOperation(Operation operation) {
        System.out.println(
                this.simpleDateFormat.format(operation.getOperationDate()) + " || "
                + (operation.getType().equals("deposit") ? operation.getAmount() : -operation.getAmount()) + " || "
                + operation.getBalanceAfterOperation()
        );
    }

    public int getBalance() {
        return balance;
    }
}
