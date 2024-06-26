package screens;

import driver.SeleniumWebDriver;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Inventory extends SeleniumWebDriver {
    static Double priceItem1;
    static Double priceItem2;
    static Double totalPriceOfBothItems;
    private static  WebElement inventoryPage(){
        return driver.findElement(By.xpath("//span[@class='title' and text()='Products']"));
    }
    public static void isOnInventoryPage(){
        inventoryPage().isDisplayed();
    }

private static WebElement sauceLabsBackPack(){
    return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
}
private static WebElement sauceLabsFleeceJacket(){
    return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }
    private static WebElement priceOfSauceLabsBackPack(){
        return driver.findElement(By.xpath("//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/div"));
    }
    private static WebElement priceOfSauceLabsFleeceJacket(){
        return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));
    }
    private static WebElement removeButtonOfBackPack(){
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }
    private static WebElement removeButtonOfFleeceJacket(){
        return driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
    }
    private static WebElement cart(){
        return driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a"));
    }
    private static double priceItem(WebElement itemLocator){
        String price = itemLocator.getText();
        String splitPrice = price.replaceAll("\\$","");
        return Double.parseDouble(splitPrice);
    }
    public static void addSauceLabsBackPackToCartAndStoreItsPriceInAnObject(){
        sauceLabsBackPack().click();
        priceItem1= priceItem(priceOfSauceLabsBackPack());
    }
    public static void addSauceLabsFleeceJacketToCartAndStoreItsPriceInAnObject(){
        sauceLabsFleeceJacket().click();
        priceItem2= priceItem(priceOfSauceLabsFleeceJacket());
    }
    public static void verifyIfRemoveButtonIsVisibleForBackPack() {
        Assert.assertTrue(removeButtonOfBackPack().isDisplayed());
    }
    public static void verifyIfRemoveButtonIsVisibleForFleeceJacket(){
        Assert.assertTrue(removeButtonOfFleeceJacket().isDisplayed());
    }
    public static void goToCart(){
        cart().click();
    }
    public static double totalPrice(){
        return totalPriceOfBothItems=(priceItem1+priceItem2);
    }

}
