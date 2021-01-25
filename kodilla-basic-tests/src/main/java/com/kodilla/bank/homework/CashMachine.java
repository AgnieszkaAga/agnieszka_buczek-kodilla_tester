package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new double[0];
    }

    public void addTransaction(double amount) {
        if (amount == 0) {
            return;
        } else {

            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = amount;
            this.transactions = newTab;
        }
    }

    public double getBalanceOfCashMachine() {
        double sum = 0;
        for (double amount : transactions) {
            sum += amount;
        }
        return sum;
    }

    public int getNumberOfAllTransactions() {
        return transactions.length;
    }

    public double getNumberOfDeposits() {
        int count = 0;
        for (double amount : transactions) {
            if (amount > 0) {
                count++;
            }
        }
        return count;
    }

    public double getNumberOfWithdrawals() {
        int count = 0;
        for (double amount : transactions) {
            if (amount < 0) {
                count++;
            }
        }
        return count;
    }

    public double getAverageDeposits() {
        double sum = 0;
        int count = 0;
        for (double amount : transactions) {
            if (amount > 0) {
                sum += amount;
                count++;
            }
        }
        return sum/count;
    }

    public double getAverageWithdrawals() {
        double sum = 0;
        int count = 0;
        for (double amount : transactions) {
            if (amount < 0) {
                sum += amount;
                count++;
            }
        }
        return sum/count;
    }
}
