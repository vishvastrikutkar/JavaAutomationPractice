package SeleniumSample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver;
    public static String homePageURL="http://www.automationpractice.pl/index.php";

    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInButton;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAccountButton;

    @FindBy(className = "logout")
    WebElement signOutButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isHomePage(){
        return driver.getCurrentUrl().contains("index");
    }

    public void navigateToSignInPage() {
        System.out.println("Click on Sign In button on Home page");
        signInButton.click();
        Assert.assertTrue(createAccountButton.isDisplayed());
    }

    public void navigateToHomePage() {
        driver.get(homePageURL);
    }

    public boolean isAccountPageDisplayed() {
        return driver.findElement(By.className("account")).isDisplayed();
    }

    public void signOut() {
        signOutButton.click();
    }
}
