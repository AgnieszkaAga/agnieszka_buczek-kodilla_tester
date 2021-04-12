package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    Wallet wallet = new Wallet();
    CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200,wallet.getBalance());
        });
        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30,cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance",100, wallet.getBalance());
        });
        When("I request $101", () -> {
            cashier.withdraw(wallet,101);
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Given("I have deposited $300 in my wallet", () -> {
            wallet.deposit(300);
            Assert.assertEquals("Incorrect wallet balance",300, wallet.getBalance());
        });
        When("I request $300", () -> {
            cashier.withdraw(wallet, 300);
        });
        Then("wallet balance should be 0", () -> {
            Assert.assertEquals(300, cashSlot.getContents());
            Assert.assertEquals(0, wallet.getBalance());
        });

        Given("I have deposited $500 in my wallet", () -> {
            wallet.deposit(500);
            Assert.assertEquals("Incorrect wallet balance",500, wallet.getBalance());
        });
        When("I request $-1", () -> {
            cashier.withdraw(wallet,-1);
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Given("there is <amount> in my wallet", (amount) -> {
            wallet.deposit((int) amount);
        });
        When("I withdraw <withdrawalAmount>", (withdrawalAmount) -> {
            cashier.withdraw(wallet,(int) withdrawalAmount);
        });
        Then("nothing should be dispensed", (amount) -> {
            cashSlot.dispense(0);
            Assert.assertEquals("Incorrect wallet balance", amount, wallet.getBalance());
        });
        Then("I should be told that I don't have enough money in my wallet", (withdrawalAmount) -> {
            Assert.assertEquals("You don't have enough money in your wallet", cashier.withdraw(wallet,(int) withdrawalAmount));
        });

        Given("there is <amount> in my wallet", (amount) -> {
            wallet.deposit((int) amount);
        });
        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
        });
        Then("I should see that the balance is <displayedAmount>", (displayedAmount) -> {
            Assert.assertEquals(displayedAmount, wallet.getBalance());
        });
    }
}
