package TestNGHT.Listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.HashMap;
import java.util.Map;

public class ExtentReportListener implements ITestListener {
    private static ExtentReports extentReports;
    private static Map<ITestResult, ExtentTest> testMap = new HashMap<>();

    @Override
    public void onStart(ITestContext iTestContext)
    {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        sparkReporter.config().setResourceCDN("Calculator Test Cases Using TestNG");
        sparkReporter.config().setReportName("Calculator Tests");
        sparkReporter.config().setTheme(Theme.DARK);

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("Host Name","Localhost");
    }
    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extentReports.createTest(result.getMethod().getMethodName());
        testMap.put(result,extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = testMap.get(result);
        if(test!=null) {
            test.pass("TEST PASSED");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        testMap.get(result).fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        testMap.get(result).fail(result.getThrowable());
    }
}
