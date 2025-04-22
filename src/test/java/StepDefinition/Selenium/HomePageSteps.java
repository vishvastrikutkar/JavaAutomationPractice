package StepDefinition.Selenium;

import SeleniumSample.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageSteps {
    WebDriver driver;
    HomePage homePage;
    TestContext testContext;

    public HomePageSteps(TestContext context)
    {
        this.testContext=context;
        this.driver = testContext.getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Then("Verify home page opened")
    public void verifyHomePageOpened() {
        Assert.assertTrue(homePage.isHomePage(),"Not a home page");
    }

    @Given("User navigate to home page")
    public void iAmOnTheHomePage() {
        homePage.navigateToHomePage();
    }
}
