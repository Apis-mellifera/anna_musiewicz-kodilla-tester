package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if(amount > wallet.getBalance()) {
            wallet.debit(0); //pomniejszenie stanu konta
        }
        else {
            wallet.debit(amount);
        }
        if(amount > wallet.getBalance()) {
            cashSlot.dispense(0);
        }
        else {
            cashSlot.dispense(amount);
        }
    }

    public String tellClient(Wallet wallet, int amount) {
       if(wallet.getBalance() - amount < 0) {
           return "You don't have sufficient funds in your account";
       }
       return "";
    }

}
