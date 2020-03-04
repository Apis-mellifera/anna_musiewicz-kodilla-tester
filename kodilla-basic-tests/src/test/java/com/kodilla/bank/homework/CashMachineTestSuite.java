package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine machine = new CashMachine();
        int[] transactions = machine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(200, transactions[0]);
        assertEquals(100, transactions[1]);
    }
    @ Test
    public void shouldCalculateTransactionsAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-2000);
        cashMachine.add(-50);
        cashMachine.add(100);
        cashMachine.add(30000);

        assertEquals(7012.5,cashMachine.getAverageOfTransactions(), 0.01);
    }
    @Test
    public void shouldReturnAverageEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverageOfTransactions(), 0.0001);
    }
}
