package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-role=\"accept-consent\"]")));

        WebElement cookiesButton = driver.findElement(By.xpath("//*[@data-role=\"accept-consent\"]"));
        cookiesButton.click();
        WebElement searchBox = driver.findElement(By.xpath("//*[@role=\"combobox\"]/input"));
        searchBox.sendKeys("Mavic mini");
        WebElement category = driver.findElement(By.xpath("//*[@data-role=\"filters-dropdown-toggle\"]"));
        Select selectCategory = new Select(category);
        selectCategory.selectByIndex(3);
        WebElement searchButton = driver.findElement(By.xpath("//*[@data-role=\"search-button\"]"));
        searchButton.click();
    }
}
