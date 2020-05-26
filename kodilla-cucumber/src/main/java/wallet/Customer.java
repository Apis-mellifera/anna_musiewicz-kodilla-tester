package wallet;

public class Customer {
    private Wallet wallet;
    private String name;

    public Customer(Wallet wallet, String name) {
        this.wallet = wallet;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void checkBalance(String number) {
        wallet.getBalance();
    }

    public String display() {
        return "The account balance: " + "$"+ wallet.getBalance();
    }
}
