package screens;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutInfo extends SeleniumWebDriver {
    private static WebElement firstName(){
        return driver.findElement(By.id("first-name"));
    }
    private static WebElement lastName(){
        return driver.findElement(By.id("last-name"));
    }
    private static WebElement postalCode(){
       return  driver.findElement(By.id("postal-code"));
    }
    private static WebElement continueButton(){
        return driver.findElement(By.id("continue"));
    }
    public static void enterFirstName(String FirstName){
        firstName().sendKeys(FirstName);
    }
    public static void enterLastName(String LastName){
        lastName().sendKeys(LastName);
    }
    public static void enterPostalCode(String PostalCode){
        postalCode().sendKeys(PostalCode);
    }
    public static void clickContinueButton(){
        continueButton().click();
    }
}
