package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cm1;
    private CashMachine cm2;
    private CashMachine cm3;
    private CashMachine[] allCashMachines;
    private int size;

    public Bank() {
        this.cm1 = new CashMachine();
        this.cm2 = new CashMachine();
        this.cm3 = new CashMachine();
        this.allCashMachines = new CashMachine[3];
        this.allCashMachines[0] = cm1;
        this.allCashMachines[1] = cm2;
        this.allCashMachines[2] = cm3;
        this.size = allCashMachines.length;
    }

    public CashMachine getCm1() {
        return this.cm1;
    }

    public CashMachine getCm2() {
        return this.cm2;
    }

    public CashMachine getCm3() {
        return this.cm3;
    }

    public double getTotalBalance() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getBalanceOfCashMachine();
        }
        return sum;
    }

    public double getTotalNumberOfTransactions() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getNumberOfAllTransactions();
        }
        return sum;
    }

    public double getTotalNumberOfWithdrawals() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public double getTotalNumberOfDeposits() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getNumberOfDeposits();
        }
        return sum;
    }

    public double getTotalAverageWithdrawals() {
        double sum = 0;
        int count = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getAverageWithdrawals();
            count++;
        }
        return sum/count;
    }

    public double getTotalAverageDeposits() {
        double sum = 0;
        int count = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getAverageDeposits();
            count++;
        }
        return sum/count;
    }
}
