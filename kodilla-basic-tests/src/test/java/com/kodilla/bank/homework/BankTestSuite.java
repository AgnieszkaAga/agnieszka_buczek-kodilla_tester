package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldCountTotalBalance() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalBalance = bank1.getTotalBalance();
        assertEquals(-600,totalBalance,0.001);
    }

    @Test
    public void shouldCountTotalNumerOfWithdrawals() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalNumberOfWithdrawals = bank1.getTotalNumberOfWithdrawals();
        assertEquals(3,totalNumberOfWithdrawals,0.001);
    }

    @Test
    public void shouldCountTotalNumberOfDeposits() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalNumberOfDeposits = bank1.getTotalNumberOfDeposits();
        assertEquals(5,totalNumberOfDeposits,0.001);
    }

    @Test
    public void shouldCountTotalAverageDeposit() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalAverageDeposit = bank1.getTotalAverageDeposits();
        assertEquals(200,totalAverageDeposit,0.001);
    }

    @Test
    public void shouldCountTotalAverageWithdrawal() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(300);
        bank1.getCm3().addTransaction(-100);
        bank1.getCm3().addTransaction(250);

        double totalAverageWithdrawal = bank1.getTotalAverageWithdrawals();
        assertEquals(-533.333,totalAverageWithdrawal,0.001);
    }

    @Test
    public void shouldCountTotalNumberOfNonZeroTransactions() {
        Bank bank1 = new Bank();
        bank1.getCm1().addTransaction(100);
        bank1.getCm1().addTransaction(-1000);
        bank1.getCm1().addTransaction(150);
        bank1.getCm2().addTransaction(0);
        bank1.getCm2().addTransaction(200);
        bank1.getCm2().addTransaction(-500);
        bank1.getCm3().addTransaction(0);
        bank1.getCm3().addTransaction(0);
        bank1.getCm3().addTransaction(250);

        double totalNuberOfTransactions = bank1.getTotalNumberOfTransactions();
        assertEquals(6,totalNuberOfTransactions,0.001);
    }
}
