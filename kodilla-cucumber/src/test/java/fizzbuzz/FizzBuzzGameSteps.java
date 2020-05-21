package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzGameSteps implements En {

    private int number;
    private String answer;

    public FizzBuzzGameSteps() {
        Given("number is multiples of three of value greater than zero", () -> {
            this.number = 3;
        });

        Given("number is multiples of five of value greater than zero", () -> {
            this.number = 5;
        });

        Given("number is multiples of both three and five of value greater than zero", () -> {
            this.number = 15;
        });

        Given("number is plain number of value greater than zero", () -> {
            this.number = 1;
        });

        When("I pass a number", () -> {
            FizzBuzzGame fizzBuzz = new FizzBuzzGame();
            this.answer = fizzBuzz.play(this.number);
        });

        Then("I should be told the correct {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
