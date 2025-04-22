package SeleniumSample.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    private final WebDriver driver;

    @FindBy(id = "customer_firstname")
    WebElement firstNameTextBox;

    @FindBy(id = "customer_lastname")
    WebElement lastNameTextBox;

    @FindBy(id = "passwd")
    WebElement passwordTextBox;

    @FindBy(id = "days")
    WebElement dobDay;

    @FindBy(id = "months")
    WebElement dobMonth;

    @FindBy(id = "years")
    WebElement dobYear;

    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement titleMrRadioButton;

    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement titleMrsRadioButton;

    @FindBy(xpath = "//p[@class='alert alert-success' and contains(., 'Your account has been created.')]")
    WebElement successMessage;

    Actions actions;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        actions = new Actions(this.driver);
    }

    public void fillForm(String title,String firstName, String lastName, String password) {
        if(title.equals("Mr")){
            titleMrRadioButton.click();
        }else {
            titleMrsRadioButton.click();
        }

        /*firstNameTextBox.sendKeys(firstName);
        lastNameTextBox.sendKeys(lastName);
        passwordTextBox.sendKeys(password);*/

        actions.click(firstNameTextBox)
                .sendKeys(firstName)
                .sendKeys(Keys.ENTER)
                .perform();

        actions.click(lastNameTextBox)
                .sendKeys(firstName)
                .sendKeys(Keys.ENTER)
                .perform();

        actions.click(passwordTextBox)
                .sendKeys(firstName)
                .sendKeys(Keys.ENTER)
                .perform();
    }

    public void submitForm() {
        //registerButton.click();
        actions.click(registerButton);
    }

    public boolean isConfirmationMessageDisplayed() {
        //return driver.findElement(By.className("info-account")).isDisplayed();
        return successMessage.isDisplayed();
    }
}
