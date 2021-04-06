package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {
    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
        public void iSeeResults() {
            System.out.println("I see results");
            System.out.println(results.size());
        }

        public RandomResult pickRandomResult(WebDriver driver) {
        Random random = new Random();
        int randomResultNumber = random.nextInt(results.size());
            System.out.println(randomResultNumber);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        results.get(randomResultNumber).findElement(By.cssSelector("h3")).click();
        RandomResult randomResult = new RandomResult(driver);
        return randomResult;
        }
    }
