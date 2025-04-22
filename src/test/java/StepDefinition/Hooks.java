package StepDefinition;


import SeleniumSample.manager.BrowserType;
import StepDefinition.Selenium.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

TestContext testContext;
private final WebDriver driver;

public Hooks(TestContext context) {
    testContext = context;
    driver=testContext.getDriver();
}

public static String homePageURL="http://www.automationpractice.pl/index.php";
public static BrowserType browserType= BrowserType.CHROME;

@Before
public void setup()
{
    driver.get(homePageURL);
}

@After
public void tearDown()
{
    System.out.println("TEST CLEANUP");
    if(driver!=null)
        driver.quit();
}
}
