package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashm1 = new CashMachine();
        int result = cashm1.getNumberOfAllTransactions();
        assertEquals(0,result);
    }

    @Test
    public void shouldCountTheBalanceOfCashMachine() {
        CashMachine cashm1 = new CashMachine();
        cashm1.addTransaction(100);
        cashm1.addTransaction(-50);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-200);
        cashm1.addTransaction(1000);

        double balance = cashm1.getBalanceOfCashMachine();
        assertEquals(850, balance);
    }

    @Test
    public void shouldCountTheNumberOfNonZeroTransaciotns() {
        CashMachine cashm1 = new CashMachine();
        cashm1.addTransaction(100);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-50);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-200);
        cashm1.addTransaction(1000);

        double numberOfTransactions = cashm1.getNumberOfAllTransactions();
        assertEquals(4, numberOfTransactions);
    }
    @Test
    public void shouldCountTheNumberOfDeposits() {
        CashMachine cashm1 = new CashMachine();
        cashm1.addTransaction(100);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-50);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-200);
        cashm1.addTransaction(1000);

        double numberOfDeposits = cashm1.getNumberOfDeposits();
        assertEquals(2, numberOfDeposits);
    }

    @Test
    public void shouldCountTheNumberOfWithdrawals() {
        CashMachine cashm1 = new CashMachine();
        cashm1.addTransaction(100);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-50);
        cashm1.addTransaction(-300);
        cashm1.addTransaction(-200);
        cashm1.addTransaction(1000);

        double numberOfWithdrawals = cashm1.getNumberOfWithdrawals();
        assertEquals(3, numberOfWithdrawals);
    }

    @Test
    public void shouldCountTheAverageWithdrawal() {
        CashMachine cashm1 = new CashMachine();
        cashm1.addTransaction(100);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-50);
        cashm1.addTransaction(-300);
        cashm1.addTransaction(-200);
        cashm1.addTransaction(1000);

        double averageWithdrawal = cashm1.getAverageWithdrawals();
        assertEquals(-183.33, averageWithdrawal, 0.01);
    }

    @Test
    public void shouldCountTheAveragePayment() {
        CashMachine cashm1 = new CashMachine();
        cashm1.addTransaction(100);
        cashm1.addTransaction(0);
        cashm1.addTransaction(-50);
        cashm1.addTransaction(-300);
        cashm1.addTransaction(-200);
        cashm1.addTransaction(1000);

        double averagePayment = cashm1.getAverageDeposits();
        assertEquals(550, averagePayment, 0.01);
    }
}
