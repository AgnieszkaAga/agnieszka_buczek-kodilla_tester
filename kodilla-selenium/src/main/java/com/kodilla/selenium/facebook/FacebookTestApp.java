package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

//        do omijania cookies
//        driver.navigate().to("https://www.google.com/");
//        driver.switchTo().frame(0);

//        wyszkukanie okna cookies
//        Thread.sleep(30000);
//        WebElement cookiesButton = driver.findElement(By.xpath("//*[@data-testid=\"cookie-policy-accept-dialog-button\"]"));
//        cookiesButton.click();

        Thread.sleep(5000);
        WebElement registrationButton = driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));
        registrationButton.click();
        Thread.sleep(5000);

        WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
