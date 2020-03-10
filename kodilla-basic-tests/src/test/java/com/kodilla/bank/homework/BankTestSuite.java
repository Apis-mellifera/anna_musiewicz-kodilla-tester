package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldSumTotalBalance() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(-50);
        cashMachine.add(150);
        cashMachine2.add(-300);
        cashMachine2.add(-300);
        cashMachine2.add(-300);
        cashMachine3.add(500);
        cashMachine3.add(0);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2, cashMachine3});

        //when
        int totalBalance = bank.getTotalBalance();

        //then
        assertEquals(-500, totalBalance);
    }

    @Test
    public void shouldCountNumberOfWithdrawals() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(-50);
        cashMachine.add(150);
        cashMachine2.add(300);
        cashMachine2.add(-300);
        cashMachine2.add(-300);
        cashMachine3.add(500);
        cashMachine3.add(0);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2, cashMachine3});

        //when
        int totalWithdraw = bank.getWithdrawalsNumber();

        //then
        assertEquals(4, totalWithdraw);
    }

    @Test
    public void shouldCountNumberOfDeposits() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(-50);
        cashMachine.add(150);
        cashMachine2.add(300);
        cashMachine2.add(-300);
        cashMachine2.add(-300);
        cashMachine3.add(500);
        cashMachine3.add(0);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2, cashMachine3});

        //when
        int totalDeposits = bank.getDepositNumber();

        //then
        assertEquals(3, totalDeposits);
    }

    @Test
    public void shouldCountAverageOfWithdrawals() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(-100);
        cashMachine.add(150);
        cashMachine2.add(300);
        cashMachine2.add(-300);
        cashMachine2.add(-200);
        cashMachine3.add(500);
        cashMachine3.add(0);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2, cashMachine3});

        //when
        double averageWithdraw = bank.getAverageWithdrawal();

        //then
        assertEquals(-200.0, averageWithdraw);
    }

    @Test
    public void shouldCountAverageOfDeposits() {
        //given
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine.add(-200);
        cashMachine.add(-50);
        cashMachine.add(100);
        cashMachine2.add(300);
        cashMachine2.add(-300);
        cashMachine2.add(-300);
        cashMachine3.add(500);
        cashMachine3.add(0);

        Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2, cashMachine3});

        //when
        double averageDeposits = bank.getAverageDeposit();

        //then
        assertEquals(300.0, averageDeposits);
    }

    @Test
    public void shouldReturnZeroWhenZeroTransactions() {
        //given
        CashMachine cashMachine = new CashMachine();

        cashMachine.add(0);

        Bank bank = new Bank(new CashMachine[]{cashMachine});

        //when
        int totalBalance = bank.getTotalBalance();
        int totalWithdraw = bank.getWithdrawalsNumber();
        int totalDeposits = bank.getDepositNumber();
        double averageWithdraw = bank.getAverageWithdrawal();
        double averageDeposits = bank.getAverageDeposit();
        //then
        assertEquals(0, totalBalance);
        assertEquals(0, totalWithdraw);
        assertEquals(0, totalDeposits);
        assertEquals(0.0, averageWithdraw);
        assertEquals(0.0, averageDeposits);
    }

    @Test
    public void shouldReturnZeroWhenZeroCashMachine() {
        //given
        CashMachine cashMachine = new CashMachine();

        Bank bank = new Bank(new CashMachine[]{});

        //when
        int totalBalance = bank.getTotalBalance();
        int totalWithdraw = bank.getWithdrawalsNumber();
        int totalDeposits = bank.getDepositNumber();
        double averageWithdraw = bank.getAverageWithdrawal();
        double averageDeposits = bank.getAverageDeposit();
        //then
        assertEquals(0, totalBalance);
        assertEquals(0, totalWithdraw);
        assertEquals(0, totalDeposits);
        assertEquals(0.0, averageWithdraw);
        assertEquals(0.0, averageDeposits);
    }
}



