package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class cartPage {

    public cartPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="termsofservice")
    public WebElement terms;

    @FindBy(css="button[value=\"checkout\"]")
    public WebElement checkOutBtn;

}
