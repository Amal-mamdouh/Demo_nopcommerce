package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Hooks {
  public static WebDriver driver;
    @Before
    public void openBrowser() {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public void quiteBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
