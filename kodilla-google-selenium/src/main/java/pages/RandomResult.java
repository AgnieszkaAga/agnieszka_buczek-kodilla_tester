package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RandomResult extends AbstractPage{

    @FindBy(css = "div[class='g']")
    WebElement result;

    public RandomResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, driver);
    }
}
