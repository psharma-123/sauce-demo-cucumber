package com.assignment;

import screens.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("Navigate to the site of swag labs")
    public void navigateToTheSiteOfSwagLabs() {
        Login.navigateToSwagLabs();
    }
    @When("Enter the correct username {string} in the field of username")
    public  void enterTheCorrectUsername(String UserName) {

        Login.fillTheCorrectUsername(UserName);
    }
    @And("Enter the correct password {string} in the field of password")
    public void enterTheCorrectPassword(String password) {
        Login.fillTheCorrectPassword(password);
    }
    @And("click on the login button")
    public void clickLogin(){
        Login.loginButtonClick();
    }
    @Then("Verify the error message on the screen")
    public void verifyErrorMessage(){
        Login.errorMessageVerification();
    }
    @Then("User must navigate to the inventory page")
    public void navigateToInventory() {
    Inventory.isOnInventoryPage();
}
   @When ("Add sauce labs backpack to the  cart and store its price in an object")
   public void addSauceLabsBackPackToTheCartAndStoreItsPriceInAnObject(){
        Inventory.addSauceLabsBackPackToCart();
   }
    @Then("Verify if remove button is visible for sauce labs backpack")
    public void verifyIfRemoveButtonIsVisibleForSauceLabsBackPack(){
        Inventory.verifyRemoveButtonOfBackPack();
    }
    @And  ("Add sauce labs fleece jacket to the  cart and store its price in an object")
    public  void addSauceLabsFleeceJacketToTheCartAndStoreItsPriceInAnObject(){
        Inventory.addSauceLabsFleeceJacketToCart();
    }
    @Then ("Verify if remove button is visible for sauce labs fleece jacket")
    public void verifyIfRemoveButtonIsVisibleForSauceLabsFleeceJacket() {
        Inventory.verifyRemoveButtonOfFleeceJacket();
    }
    @Then ("Click on the shopping cart icon")
    public void clickOnTheShoppingCartIcon() {
        Inventory.goToCart();
    }
   @When ("Check whether the price of sauce labs backpack is same or not")
   public void  checkWhetherThePriceOfSauceLabsBackpackIsSameOrNot(){
       Cart.comparePriceOfBackpack();
   }
    @And ("Check whether the price od sauce labs fleece jacket is same or not")
    public void CheckWhetherThePriceOfSauceLabsFleeceJacketIsSameOrNot(){
        Cart.comparePriceOfFleeceJacket();
    }
    @Then ("If both prices are same then click  on the checkout button")
    public void clickOnTheCheckoutButton(){
        Cart.goToCheckout();
    }
    @When ("Enter your first name")
    public  void enterYourFirstName(){
        CheckoutInfo.enterFirstName();
    }
    @And ("Enter your last  name")
    public void enterYourLastName(){
        CheckoutInfo.enterLastName();
    }
    @And  ("Enter the postal code of your address")
    public void enterThePostalCodeOfYourAddress(){
        CheckoutInfo.enterPostalCode();
    }
    @Then ("Click on the continue button")
    public void clickOnTheContinueButton(){
    CheckoutInfo.clickContinueButton();
    }
    @When("Verify if you are on the final checkout screen")
    public void  verifyIfYouAreOnTheFinalCheckoutScreen(){
        CheckoutOverview.isOnCheckoutOverviewScreen();
    }
    @And ("Verify item total")
    public void verifyItemTotal(){
        CheckoutOverview.verifySubTotal();
    }
    @And  ("Get the  value of tax")
    public void getTheValueOfTax(){
        CheckoutOverview.getTheValueOfTax();
    }
    @And ("Verify the Grand total")
    public void verifyTheGrandTotal(){
        CheckoutOverview.verifyCheckoutTotal();
    }
    @Then ("Click on the finish button")
    public void clickOnTheFinishButton(){
        CheckoutOverview.clickFinishButton();
    }
    @And ("Verify if you are on the checkout complete page")
    public void verifyIfYOuAreOnTheCheckoutCompletePage(){
        CheckoutComplete.isOnCheckoutCompletePage();
    }
    @And ("Verify Thank you message")
    public void verifyThankYouMessage(){
        CheckoutComplete.thankYouMessage();
    }
    @Then ("Click om back home button")
    public void clickOnTheHomeButton(){
        CheckoutComplete.clickBackHomeButton();
    }
    @Then ("Verify if you are on the inventory screen")
    public void verifyIfYouAreOnTheInventoryScreen(){
        Inventory.isOnInventoryPage();
    }

}
