package screens;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.DecimalFormat;

public class CheckoutOverview extends SeleniumWebDriver {
   // static double checkoutSubTotal;
   //static double tax;
   // static double checkoutTotal;
    private static WebElement checkoutOverviewScreen(){
        return driver.findElement(By.xpath("//span[@class='title' and text()='Checkout: Overview']"));
    }
    private static WebElement subTotal(){
        return driver.findElement(By.className("summary_subtotal_label"));
    }
    private static WebElement tax(){
        return driver.findElement(By.className("summary_tax_label"));
    }
    private static WebElement checkoutTotal(){
        return driver.findElement(By.className("summary_total_label"));
    }
private static WebElement finishButton(){
        return driver.findElement(By.id("finish"));
}
public static void isOnCheckoutOverviewScreen(){
    Assert.assertTrue(checkoutOverviewScreen().isDisplayed());
}
public  static void verifySubTotal(){
        Assert.assertTrue(subTotal().getText().contains(String.valueOf(Inventory.totalPrice())));
}
public static double getTheValueOfTax(){
  String taxValue=tax().getText();
  String tax= taxValue.replaceAll("[^\\d.]","");
  return Double.parseDouble(tax);
}
public static void verifyCheckoutTotal(){
    DecimalFormat df= new DecimalFormat("0.00");
        checkoutTotal().getText().contains(String.valueOf(df.format(getTheValueOfTax()+Inventory.totalPrice())));
}
public static void clickFinishButton(){
        finishButton().click();
}

}
