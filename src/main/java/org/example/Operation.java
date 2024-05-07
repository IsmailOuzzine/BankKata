package org.example;

import java.util.Date;

public class Operation {

    private Date operationDate;
    private String type;
    private int amount;
    private int balanceAfterOperation;

    public Operation(Date operationDate, String type, int amount, int balanceAfterOperation) {
        this.operationDate = operationDate;
        this.type = type;
        this.amount = amount;
        this.balanceAfterOperation = balanceAfterOperation;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBalanceAfterOperation() {
        return balanceAfterOperation;
    }

    public void setBalanceAfterOperation(int balanceAfterOperation) {
        this.balanceAfterOperation = balanceAfterOperation;
    }
}
