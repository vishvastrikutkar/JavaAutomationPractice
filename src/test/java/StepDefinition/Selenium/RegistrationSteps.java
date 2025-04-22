package StepDefinition.Selenium;

import SeleniumSample.pages.HomePage;
import SeleniumSample.pages.RegistrationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;


public class RegistrationSteps {
    private WebDriver driver;
    private HomePage homePage;
    private RegistrationPage registrationPage;

    TestContext testContext;
    public RegistrationSteps(TestContext context) {

        this.testContext = context;
        this.driver = testContext.getDriver();
        homePage = testContext.getPageObjectManager().getHomePage();
        registrationPage = testContext.getPageObjectManager().getRegistrationPage();
    }

    @Given("User navigate to Sign in page")
    public void navigateToSignInPage() {
        homePage.navigateToSignInPage();
    }

    @When("User enter valid details")
    public void user_enter_valid_details(DataTable dataTable) {
        List<List<String>> data= dataTable.asLists();

        String title = data.get(0).get(1);
        String firstName = data.get(1).get(1);
        String lastName = data.get(2).get(1);
        String password = data.get(3).get(1);

        testContext.getScenarioManager().setContext("PASSWORD",password);
        registrationPage.fillForm(title, firstName, lastName, password);
    }

    @When("User submit the registration form")
    public void user_submit_the_registration_form() {
        registrationPage.submitForm();
    }

    @Then("User should see a confirmation message")
    public void user_should_see_a_confirmation_message() {
        Assert.assertTrue(registrationPage.isConfirmationMessageDisplayed());
    }
}
