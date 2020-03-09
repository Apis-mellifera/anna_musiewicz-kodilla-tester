package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getTotalBalance() {
        int balance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            balance += cashMachines[i].checkBalance();
        }
        return balance;
    }

    public int getWithdrawalsNumber() {
        int withdrow = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] < 0) {
                    withdrow++;
                }
            }
        }
        return withdrow;
    }

    public int getDepositNumber() {
        int deposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] > 0) {
                    deposit++;
                }
            }
        }
        return deposit;
    }

    public int getWithdrawnSum() {
        int withdrow = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] < 0) {
                    withdrow += transactions[j];
                }
            }
        }
        return withdrow;
    }

    public int getDepositSum() {
        int deposit = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            int[] transactions = cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j] > 0) {
                    deposit += transactions[j];
                }
            }
        }
        return deposit;
    }

    public double getAverageWithrawals() {
        if (getWithdrawalsNumber() == 0)
            return 0;
        return getWithdrawnSum() / getWithdrawalsNumber();
    }

    public double getAverageDeposit() {
        if (getWithdrawalsNumber() == 0)
            return 0;
        return getDepositSum() / getDepositNumber();
    }
}
