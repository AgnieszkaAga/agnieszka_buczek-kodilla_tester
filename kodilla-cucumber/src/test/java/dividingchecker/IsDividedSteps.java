package dividingchecker;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class IsDividedSteps implements En {
    private int number;
    private String answer;

    public void isItDividedBy() {
        Given("I check <number>", (int number) -> {
            this.number = number;
            });

        When("I ask whether it's divided by 3 and additional by 5", () -> {
            NumberDividingChecker numberDividingChecker = new NumberDividingChecker();
            this.answer = numberDividingChecker.dividingChecker(this.number);
        });

        When("I ask whether it's divided by 3 and 5", () -> {
            NumberDividingChecker numberDividingChecker = new NumberDividingChecker();
            this.answer = numberDividingChecker.dividingChecker(this.number);
        });

        When("I ask whether it's divided by 5 and additional by 3", () -> {
            NumberDividingChecker numberDividingChecker = new NumberDividingChecker();
            this.answer = numberDividingChecker.dividingChecker(this.number);
        });

        Then("I get <answer>", (String string) -> {
            Assertions.assertEquals(string, this.answer);
        });
    }
}
