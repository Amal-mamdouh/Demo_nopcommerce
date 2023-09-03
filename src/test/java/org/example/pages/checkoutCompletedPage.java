package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class checkoutCompletedPage {
    public checkoutCompletedPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong" )
    public WebElement confirmMsg;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")
    public WebElement orderDetails;
}
