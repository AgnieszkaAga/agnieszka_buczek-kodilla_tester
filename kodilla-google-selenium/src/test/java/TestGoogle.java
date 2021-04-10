import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearch;

public class TestGoogle {
    WebDriver driver;

    @Before
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
//        driver.close();
        }

    @Test
    public void testGooglePage(){
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        googleSearch.pickingResult();
    }
}