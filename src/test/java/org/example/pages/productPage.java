package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class productPage {
    public productPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="add-to-cart-button-18")
    public WebElement addToCartButton;

    @FindBy(className="cart-label")
    public WebElement cartIcon;

}
