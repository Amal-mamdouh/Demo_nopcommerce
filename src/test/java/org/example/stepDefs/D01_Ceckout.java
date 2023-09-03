package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_Ceckout {
    homePage home = new homePage();
    productPage product=new productPage();
    cartPage cart= new cartPage();
    checkoutasguestOrRegisterPage asGuest =new checkoutasguestOrRegisterPage();
    checkoutPage checkout =new checkoutPage();
    checkoutCompletedPage completedPage=new checkoutCompletedPage();
    Faker fake= new Faker() ;
    SoftAssert soft =new SoftAssert();

    @Given("The guest user add product to the shopping cart page")
    public void userAddProductToShoppingCart() {
        //User select and opens the product
        home.product.click();
        //User click on add to the cart button that on the product page
        product.addToCartButton.click();
    }


    @When("The guest user navigate to the shopping cart page")
    public void theGuestUserNavigateToTheShoppingCartPage() {
        product.cartIcon.click();
    }

    @And("The guest user agrees to the terms and conditions and clicks on the Check out button")
    public void theGuestUserAgreesToTheTermsAndConditionsAndClicksOnTheCheckOutButton() {
        cart.terms.click();
        cart.checkOutBtn.click();
    }

    @Then("The user clicks on check out as a guest button")
    public void theUserClicksOnCheckOutAsAGuestButton() {
        asGuest.checkoutAsGuestBtn.click();
    }

    @And("The guest user adds his details:{string},{string},{string},{string}")
    public void theGuestUserAddsHisDetails(String firstName, String lastName, String email, String company) {
        firstName=fake.name().firstName();
        checkout.firstName.sendKeys(firstName);
        lastName=fake.name().lastName();
        checkout.lastName.sendKeys(lastName);
        email=fake.internet().emailAddress();
        checkout.email.sendKeys(email);
        company= fake.company().name();
        checkout.company.sendKeys(company);
    }

    @And("The guest user selects the country")
    public void theGuestUserSelectsThe() {
        Select selectCountry= new Select(checkout.countryList);
        selectCountry.selectByValue("4");
    }

    @And("The guest user adds {string} and <{string}> details")
    public void theGuestUserAddsAndDetails(String city, String address) {
     city=fake.address().city();
     checkout.city.sendKeys(city);
     address=fake.address().fullAddress();
     checkout.address.sendKeys(address);
    }

    @And("The user adds {string},{string} and fax")
    public void theUserAddsAnd(String zip,String phoneNumber) {
        zip=fake.address().zipCode();
        checkout.zipPostalCode.sendKeys(zip);
        phoneNumber=fake.phoneNumber().phoneNumber();
        checkout.phoneNumber.sendKeys(phoneNumber);
        checkout.faxNumber.sendKeys("001144");
    }

    @And("The user clicks on Continue")
    public void theUserClicksOnContinue() {
        checkout.continueBtn_billingAddress.click();
    }

    @And("The user selects the shipping method and clicks on Continue")
    public void theUserSelectsTheShippingMethodAndClicksOnContinue() {
        boolean statues= checkout.shippingMethodGround.isSelected();
        if(statues==false)
        {checkout.shippingMethodGround.click();}
        checkout.continueBtn_ShippingMethod.click();
    }

    @And("The user selects check money order method and clicks on Continue")
    public void theUserSelectsCheckMoneyOrderMethodAndClicksOnContinue() {
        boolean statues= checkout.paymentMethod_CheckMoneyOrder.isSelected();
        if(statues==false)
        {checkout.paymentMethod_CheckMoneyOrder.click();}
        checkout.continueBtn_paymentMethod.click();
    }

    @And("The user clicks on Continue in payment information")
    public void theUerClicksOnContinue() {
        checkout.continueBtn_PaymentInfo.click();
    }

    @And("The guest user clicks on Confirm")
    public void theGuestUserClicksOnConfirm() {
        checkout.confirmBtn.click();
    }

    @Then("The order is confirmed and the user can navigate to order details")
    public void theOrderIsConfirmedAndTheUserCanNavigateToOrderDetails() {
        String actualMsg =completedPage.confirmMsg.getText();
        String expectedMsg="Your order has been successfully processed!";
        boolean result=actualMsg.contains(expectedMsg);
        soft.assertTrue(result);
       //user navigate to order details
        completedPage.orderDetails.click();
    }


    @And("The user selects check Credit Card method and clicks on Continue")
    public void theUserSelectsCheckCreditCardMethodAndClicksOnContinue() {
        boolean statues= checkout.paymentMethod_CreditCard.isSelected();
        if(statues==false)
        {checkout.paymentMethod_CreditCard.click();}
        checkout.continueBtn_PaymentMethodCreditCard.click();

    }
    @And("The user adds the payment method details:{string},cardNumber,Expiration date,cardCode and clicks on Continue")
    public void theUserAddsThePaymentMethodDetailsCardNumberExpirationDateCardCodeAndClicksOnContinue(String holderName) {
        Select selectCredit= new Select(checkout.cardType);
        selectCredit.selectByValue("MasterCard");
        holderName=fake.name().fullName();
        checkout.holderName.sendKeys(holderName);
        checkout.cardNumber.sendKeys("5555555555554444");
        Select selectMonth= new Select(checkout.month);
        selectMonth.selectByValue("2");
        Select selectYear= new Select(checkout.year);
        selectYear.selectByValue("2025");
        checkout.cardCode.sendKeys("907");
        checkout.continueBtn_PaymentInfoCreditCard.click();
    }

}
