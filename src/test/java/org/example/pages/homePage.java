package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

import static org.example.stepDefs.Hooks.driver;
public class homePage {
  public homePage(){
   PageFactory.initElements(driver,this);
  }

  @FindBy(css="img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]")
  public WebElement product;


}
