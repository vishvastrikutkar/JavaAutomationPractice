package SeleniumSample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    private String URL="http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";

    @FindBy(id = "email_create")
    WebElement newEmailIDTextBox;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAccountButtonLoginPage;

    @FindBy(id = "email")
    WebElement existingUserEmailIDTextBox;

    @FindBy(id = "passwd")
    WebElement existingUserPasswordTextBox;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signInButton;

    @FindBy(xpath = "//li[contains(text(),'An account using this email address has already been registered')]")
    WebElement existingAccountError;

    @FindBy(xpath = "//li[normalize-space()='Authentication failed.']")
    WebElement signInError;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement menuWomen;

    @FindBy(xpath = "//a[normalize-space()='Blog']")
    WebElement menuBlog;

    public Actions actions;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        actions = new Actions(driver);
    }

    public void openPage()
    {
        driver.get(URL);
    }

    public void enterCredentials(String email, String password) {
        existingUserEmailIDTextBox.sendKeys(email);
        existingUserPasswordTextBox.sendKeys(password);
    }

    public void submitForm() {
        signInButton.click();
        System.out.println("Clicked on Sign In button");
    }

    public boolean isSignInPageDisplayed() {
        return signInButton.isDisplayed();
    }

    public void enterEmailIDToCreateNewAccount( String emailID )
    {
        System.out.println("Entering email ID to create new account :"+emailID);

        /* Perform operations using action element */
        actions.moveToElement(menuWomen)
                .build()
                .perform();

        actions.moveToElement(menuBlog)
                .build()
                .perform();

        newEmailIDTextBox.sendKeys(emailID);

        actions.moveToElement(createAccountButtonLoginPage)
                .click()
                .build()
                .perform();

        //createAccountButtonLoginPage.click();


        System.out.println("Clicked on Create Account Page successfully");
    }

    public boolean verifyAccountError(String errorText)
    {
        System.out.println(existingAccountError.getText());
        return existingAccountError.getText().contains(errorText);
    }

    public boolean verifySignInError(String errorText)
    {
        System.out.println(signInError.getText());
        return signInError.getText().contains(errorText);
    }


}
