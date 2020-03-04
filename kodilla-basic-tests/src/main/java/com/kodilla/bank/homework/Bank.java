package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getTotalBalance() {
        int balance = 0;
        for (int i = 0; i < cashMachines.length ; i++) {
            balance+=cashMachines[i].checkBalance();
        }
        return balance;
    }
}
