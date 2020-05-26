package wallet;

public class Account {
    private int balance = 0;
    private String number;

    public Account() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return  balance;
    }

    public String getNumber() {
        return number;
    }
}
