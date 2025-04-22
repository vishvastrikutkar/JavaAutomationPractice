package StepDefinition.Selenium;

import SeleniumSample.pages.HomePage;
import SeleniumSample.pages.LoginPage;
import SeleniumSample.pages.RegistrationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import java.util.List;
import java.util.Random;


public class LoginSteps {
    TestContext testContext;
    private final WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public RegistrationPage registrationPage;

    public LoginSteps(TestContext context)
    {
        this.testContext = context;
        this.driver = testContext.getDriver();
        registrationPage = testContext.getPageObjectManager().getRegistrationPage();
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }
    @Given("I am on the sign in page")
    public void i_am_on_the_sign_in_page() {
        loginPage.openPage();
    }

    @Then("close browser")
    public void closeBrowser() {
        driver.close();
    }

    @When("User enter valid credentials")
    public void user_enter_valid_credentials(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists();
        String userName = dataList.get(0).get(1);
        String password = dataList.get(1).get(1);
        loginPage.enterCredentials(userName,password);
    }

    @When("User submit the sign in form")
    public void user_submit_the_sign_in_form() {
        loginPage.submitForm();
    }

    @Then("User should see my account page")
    public void user_should_see_my_account_page() {
        Assert.assertTrue(homePage.isAccountPageDisplayed());
    }

    @Given("I am signed in")
    public void i_am_signed_in() {
        loginPage.openPage();
        loginPage.enterCredentials("john.doe@example.com", "password123");
        loginPage.submitForm();
    }

    @When("User sign out")
    public void i_sign_out() {
        homePage.signOut();
    }

    @Then("User should see the sign in page")
    public void user_should_see_the_sign_in_page() {
        Assert.assertTrue(loginPage.isSignInPageDisplayed());
    }

    @When("User enter valid email address to Create New Account")
    public void iEnterValidEmailAddress() {
        Random random = new Random();
        String emailID = "testing"+random.nextInt(1,9999)+"@test.co.in";
        testContext.getScenarioManager().setContext("EMAIL_ID",emailID);
        loginPage.enterEmailIDToCreateNewAccount(emailID);
    }

    @When("User enter existing email address {string} to Create New Account")
    public void userEntersExistingEmailForNewAccountRegistration(String emailID) {
        loginPage.enterEmailIDToCreateNewAccount(emailID);
    }

    @Then("User gets existing account error {string}")
    public void userGetsAccountError(String error) {
        Assert.assertTrue(loginPage.verifyAccountError(error),"Account Error not displayed ");
    }

    @Then("User fails to sign in with error {string}")
    public void userGetsSignInError(String error)
    {
        Assert.assertTrue(loginPage.verifySignInError(error),"Sign in error no displayed ");
    }
}
