package runner;


import driver.SeleniumWebDriver;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "com.assignment",
            plugin = {"pretty","html:target/cucumber-assignment-reports/index.html"}

    )
    public class RunCucumberTestParallel extends AbstractTestNGCucumberTests{

//        @BeforeClass
//        public static void initDriver() {
//            SeleniumWebDriver.initChrome();
//        }
//
//        @AfterClass
//        public static void tearDown() {
//            SeleniumWebDriver.closeDriver();
//        }
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}


