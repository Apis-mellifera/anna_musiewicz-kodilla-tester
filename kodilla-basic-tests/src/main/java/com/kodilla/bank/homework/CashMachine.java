package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;

    public CashMachine() {
        transactions = new int[0];
    }

    public int checkBalance() {
        int balance = 0;
        for (int i = 0; i < transactions.length; i++) {
            balance += transactions[i];
        }
        return balance;
    }

    public int numberOfTransactions() {
        return transactions.length;
    }

    public void add(int transaction) { // increasing array's size
        //this.size++;
        int[] newTab = new int[this.transactions.length + 1];
        for (int i = 0; i < this.transactions.length; i++) {
            newTab[i] = this.transactions[i];
        }
        newTab[this.transactions.length] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }
}
