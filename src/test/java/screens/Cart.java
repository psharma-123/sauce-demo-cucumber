package screens;

import driver.SeleniumWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static screens.Inventory.priceItem1;
import static screens.Inventory.priceItem2;

public class Cart extends SeleniumWebDriver {
    private static WebElement backpackPriceInCart(){
        return driver.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/div"));
    }
    private static WebElement fleeceJacketPriceInCart(){
        return driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div"));
    }
    private static WebElement checkoutButton(){
        return driver.findElement(By.id("checkout"));
    }
    public static void comparePriceOfBackpack(){
        Assert.assertTrue(backpackPriceInCart().getText().contains(String.valueOf(priceItem1)));
    }
    public static void comparePriceOfFleeceJacket(){
        Assert.assertTrue(fleeceJacketPriceInCart().getText().contains(String.valueOf(priceItem2)));
    }
    public static void goToCheckout(){
        checkoutButton().click();
    }
}
