package StepDefinition.Selenium;
import SeleniumSample.manager.DriverManager;
import SeleniumSample.manager.PageObjectManager;
import SeleniumSample.manager.ScenarioManager;
import StepDefinition.Hooks;
import org.openqa.selenium.WebDriver;

public class TestContext {
    private WebDriver driver;
    private final PageObjectManager pageObjectManager;
    private final DriverManager driverManager;
    private final ScenarioManager scenarioManager;

    public TestContext()
    {
        driverManager = new DriverManager();
        setDriver(driverManager.setupDriver(Hooks.browserType));
        pageObjectManager = new PageObjectManager(driverManager.getDriver());
        scenarioManager = new ScenarioManager();
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioManager getScenarioManager() {
        return scenarioManager;
    }

}
