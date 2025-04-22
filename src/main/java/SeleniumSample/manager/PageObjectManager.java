package SeleniumSample.manager;

import SeleniumSample.pages.HomePage;
import SeleniumSample.pages.LoginPage;
import SeleniumSample.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private RegistrationPage registrationPage;

    public PageObjectManager(WebDriver driver) {
        this.driver=driver;
    }

    public HomePage getHomePage() {
        return (homePage==null) ? homePage=new HomePage(driver):homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage==null) ? loginPage=new LoginPage(driver):loginPage;
    }

    public RegistrationPage getRegistrationPage() {
        return (registrationPage==null) ? registrationPage=new RegistrationPage(driver):registrationPage;
    }
}
