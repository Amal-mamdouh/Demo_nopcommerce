package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class checkoutPage {
    public checkoutPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="BillingNewAddress_FirstName")
    public WebElement firstName;
    @FindBy(id="BillingNewAddress_LastName")
    public WebElement lastName;
    @FindBy(id="BillingNewAddress_Email")
    public WebElement email;
    @FindBy(id="BillingNewAddress_Company")
    public WebElement company;
    @FindBy(id="BillingNewAddress_CountryId")
    public WebElement countryList;

    @FindBy(id="BillingNewAddress_City")
    public WebElement city;
    @FindBy(id="BillingNewAddress_Address1")
    public WebElement address;
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    public WebElement zipPostalCode;
    @FindBy(id="BillingNewAddress_PhoneNumber")
    public WebElement phoneNumber;
    @FindBy(id="BillingNewAddress_FaxNumber")
    public WebElement faxNumber;
    @FindBy(css ="button[onclick=\"Billing.save()\"]")
    public WebElement continueBtn_billingAddress;
    @FindBy(css ="input[value=\"Ground___Shipping.FixedByWeightByTotal\"]")
    public WebElement shippingMethodGround;
    @FindBy(css ="button[onclick=\"ShippingMethod.save()\"")
    public WebElement continueBtn_ShippingMethod;

    @FindBy(id="paymentmethod_0")
    public WebElement paymentMethod_CheckMoneyOrder;
    @FindBy(css ="button[onclick=\"PaymentMethod.save()\"")
    public WebElement continueBtn_paymentMethod;
    @FindBy(css ="button[onclick=\"PaymentInfo.save()\"")
    public WebElement continueBtn_PaymentInfo;

    @FindBy(css ="button[onclick=\"ConfirmOrder.save()\"")
    public WebElement confirmBtn;



    @FindBy(id="paymentmethod_1")
    public WebElement paymentMethod_CreditCard;

    @FindBy(css ="button[onclick=\"PaymentMethod.save()\"")
    public WebElement continueBtn_PaymentMethodCreditCard;
    @FindBy(id="CreditCardType")
    public WebElement cardType;
    @FindBy(id="CardholderName")
    public WebElement holderName;
    @FindBy(id="CardNumber")
    public WebElement cardNumber;
    @FindBy(id="ExpireMonth")
    public WebElement month;
    @FindBy(id="ExpireYear")
    public WebElement year;
    @FindBy(id="CardCode")
    public WebElement cardCode;
    @FindBy(css ="button[onclick=\"PaymentInfo.save()\"")
    public WebElement continueBtn_PaymentInfoCreditCard;
}
