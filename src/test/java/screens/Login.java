package screens;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.Assert.assertTrue;

public class Login extends SeleniumWebDriver {

    private static WebElement loginButton(){
        return driver.findElement(By.id("login-button"));
    }
    private static  WebElement errorMessage(){
        return driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
    }
    private static WebElement fillUserName() {
        return driver.findElement(By.id("user-name"));
    }
    private static  WebElement fillPassword(){
        return driver.findElement(By.id("password"));
    }
    public static void navigateToSwagLabs() {
        driver.get("https://www.saucedemo.com/");
    }
    public static void fillTheCorrectUsername(String UserName){
        fillUserName().sendKeys(UserName);
    }
    public static void fillTheCorrectPassword(String password){
     fillPassword().sendKeys(password);
    }
    public static void errorMessageVerification(){
        assertTrue(errorMessage().getText().contains("Username is required"));
    }
    public static void loginButtonClick(){
        loginButton().click();
    }
}
