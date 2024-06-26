package screens;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static screens.Inventory.priceItem1;
import static screens.Inventory.priceItem2;

public class Cart extends SeleniumWebDriver {
    private static WebElement backpackPriceInCart(){
        return driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']/preceding-sibling::div[@class='inventory_item_price']"));
    }
    private static WebElement fleeceJacketPriceInCart(){
        return driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']/preceding-sibling::div[@class='inventory_item_price']"));
    }
    private static WebElement checkoutButton(){
        return driver.findElement(By.id("checkout"));
    }
    public static void checkWhetherThePriceOfBackpackIsSameOrNot() {
        Assert.assertTrue(backpackPriceInCart().getText().contains(String.valueOf(priceItem1)));
    }

    public static void checkWhetherThePriceOfFleeceJacketIsSameOrNot(){
        Assert.assertTrue(fleeceJacketPriceInCart().getText().contains(String.valueOf(priceItem2)));
    }
    public static void goToCheckout(){
        checkoutButton().click();
    }
}
