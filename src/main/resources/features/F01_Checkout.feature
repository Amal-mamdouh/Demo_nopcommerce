@smoke
Feature: Check out as guest | The Guest can check out the products and make a payment

  Scenario: The user can check out the products in his shopping cart and pay for them by check/money order payment method
    Given The guest user add product to the shopping cart page
    When The guest user navigate to the shopping cart page
    And The guest user agrees to the terms and conditions and clicks on the Check out button
    Then The user clicks on check out as a guest button
    And The guest user adds his details:"<fristName>","<lastName>","<email>","<company>"
    And The guest user selects the country
    And The guest user adds "<city>" and <"address"> details
    And The user adds "zip/postalcode","<Phone number>" and fax
    And The user clicks on Continue
    And The user selects the shipping method and clicks on Continue
    And The user selects check money order method and clicks on Continue
    And The user clicks on Continue in payment information
    And The guest user clicks on Confirm
    Then The order is confirmed and the user can navigate to order details

  Scenario: The user can check out the products in his shopping cart and pay for them by Credit Card order payment method
    Given The guest user add product to the shopping cart page
    When The guest user navigate to the shopping cart page
    And The guest user agrees to the terms and conditions and clicks on the Check out button
    Then The user clicks on check out as a guest button
    And The guest user adds his details:"<fristName>","<lastName>","<email>","<company>"
    And The guest user selects the country
    And The guest user adds "<city>" and <"address"> details
    And The user adds "zip/postalcode","<Phone number>" and fax
    And The user clicks on Continue
    And The user selects the shipping method and clicks on Continue
    And The user selects check Credit Card method and clicks on Continue
    And The user adds the payment method details:"cardHolderName",cardNumber,Expiration date,cardCode and clicks on Continue
    And The guest user clicks on Confirm
    Then The order is confirmed and the user can navigate to order details