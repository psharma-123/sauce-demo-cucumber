package screens;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Login  extends SeleniumWebDriver{


    private static WebElement loginButton(){
        return driver.findElement(By.id("login-button"));
    }
    private static  WebElement errorMessage(){
        return driver.findElement(By.xpath("//*[@id='login_button_container']//h3"));
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
        fillUserName().sendKeys("standard_user");
    }

    public static void fillTheCorrectPassword(String password){
     fillPassword().sendKeys("secret_sauce");
    }

    public static void errorMessageVerification(){
        Assert.assertTrue(errorMessage().getText().contains("Username is required"));
    }
    public static void loginButtonClick(){
        loginButton().click();
    }
}
