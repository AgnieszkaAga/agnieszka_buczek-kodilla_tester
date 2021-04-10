package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {
    private MonthDay today;
    private String answer;

    public void IsItSummerStep() {
        Given("today is the last day of December", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(12,31);
        });

        Given("today is first day of August", () -> {
            this.today = MonthDay.of(8,1);
        });

        Given("22nd of January", () -> {
            this.today = MonthDay.of(1,22);
        });

        Given("6th of May", () -> {
            this.today = MonthDay.of(5,6);
        });

        Given("25th of August", () -> {
            this.today = MonthDay.of(8,25);
        });

        Given("second day of September", () -> {
            this.today = MonthDay.of(9,2);
        });

        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });
    }
}
