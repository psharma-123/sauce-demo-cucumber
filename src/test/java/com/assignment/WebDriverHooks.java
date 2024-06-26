package com.assignment;

import driver.SeleniumWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverHooks extends SeleniumWebDriver {

    @Before
    public void setUp() {
        SeleniumWebDriver.initChrome();
        }

    @After
    public void tearDown() {
        SeleniumWebDriver.closeDriver();
    }
}
