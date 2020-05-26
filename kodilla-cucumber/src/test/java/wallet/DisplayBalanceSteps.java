package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {
    private Wallet wallet = new Wallet();
    private Customer customer = new Customer(wallet, "Smith");

    public DisplayBalanceSteps() {
        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect account balance",100, wallet.getBalance());
        });

        When("I check my balance", () -> {
            customer.checkBalance("7648HY");
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then("I should see that my balance is $100", () -> {
            String display = customer.display();
            Assert.assertEquals("The account balance: $100", display);
        });
    }
}
