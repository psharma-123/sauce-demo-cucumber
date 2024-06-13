import driver.SeleniumWebDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/resources/Features/saucedemo.feature"},
            glue={"com.assignment"},
            plugin={"pretty","html:target/cucumber-assignment-reports/index.html", "json:target/cucumber-assignment-reports/Cucumber.json", "junit:target/cucumber-assignment-reports/Cucumber.xml"}

    )

        public class  RunCucumberTest extends SeleniumWebDriver {
            @BeforeClass
            public static void initDriver() {
                initChrome();
            }

            @AfterClass
            public static void tearDown() {
                closeDriver();
            }
        }


