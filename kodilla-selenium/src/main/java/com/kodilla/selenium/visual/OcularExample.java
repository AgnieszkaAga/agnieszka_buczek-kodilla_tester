package com.kodilla.selenium.visual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

//        Ocular.config()
//                .resultPath(Paths.get("c:\\kodilla\\ocular\\results"))
//                .snapshotPath(Paths.get("c:\\kodilla\\ocular\\snapshots"))
//                .globalSimilarity(95)
//                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
//        page.compare();
        page.close();
    }
}