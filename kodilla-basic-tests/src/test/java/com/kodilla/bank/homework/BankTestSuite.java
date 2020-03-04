package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
@Test
    public void shouldSumTotalBalance() {
    //given
    CashMachine cashMachine  = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();
    cashMachine.add(-200);
    cashMachine.add(-50);
    cashMachine.add(150);
    cashMachine2.add(-300);
    cashMachine2.add(-300);
    cashMachine2.add(-300);
    cashMachine3.add(500);

    Bank bank = new Bank(new CashMachine[]{cashMachine, cashMachine2, cashMachine3});

    //when
    int totalBalance = bank.getTotalBalance();

    //then
    assertEquals(-500, totalBalance);

}



    }



