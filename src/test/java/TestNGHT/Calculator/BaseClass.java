package TestNGHT.Calculator;

import org.testng.annotations.*;
import com.epam.tat.module4.Calculator;
public class BaseClass {

    public Calculator calculator;


    // Parameterized Test with DataProvider
    @DataProvider(name = "sumTestDataInteger")
    public Object[][] createIntegerData() {
        return new Object[][] {
                { 1, 2, 3 },{ 99999999, 99999999, 199999998 },{ -55, -777, -832 }
        };
    }

    // Parameterized Test with DataProvider
    @DataProvider(name = "sumTestDataDouble")
    public Object[][] createDoubleData() {
        return new Object[][] {
                { 10.585, 52.689, 63.274 },{ 2.5, 2.5, 5.0 },{ -666999.99,-886622 ,-1553621.99 }
        };
    }

    // Parameterized Test with DataProvider
    @DataProvider(name = "subTestDataInteger")
    public Object[][] createIntegerSubData() {
        return new Object[][] {
                { 10, 5, 5 },{ 99999999, 99999999, 0 },{ -55, -777, 722 }
        };
    }

    // Parameterized Test with DataProvider
    @DataProvider(name = "subTestDataDouble")
    public Object[][] createDoubleSubData() {
        return new Object[][] {
                { 10.585, 52.689, -42.104},{ 6.999, 3.222, 3.7769999999999997 },{ -666999.99,-886.622 ,-666113.368 }
        };
    }

    // Parameterized Test with DataProvider
    @DataProvider(name = "mulTestDataInteger")
    public Object[][] createIntegerMulData() {
        return new Object[][] {
                { 1, 2, 2 },{ 999, 999, 998001 },{ -55, 777, -42735 }
        };
    }
    // Parameterized Test with DataProvider
    @DataProvider(name = "mulTestDataDouble")
    public Object[][] createDoubleMulData() {
        return new Object[][] {
                { 10.585, 62.689, 663.0 },{ 9999.999, 6.333366, 63333.0 },{ -5.5, -7.77, 42.0 }
        };
    }

    // Parameterized Test with DataProvider
    @DataProvider(name = "divTestDataInteger")
    public Object[][] createIntegerDivData() {
        return new Object[][] {
                { 4, 2, 2 },{ 88888, 22222, 4 },{ -50, -25, 2 }
        };
    }

    // Parameterized Test with DataProvider
    @DataProvider(name = "divTestDataDouble")
    public Object[][] createDoubleDivData() {
        return new Object[][] {
                { 450.258, 56, 8.040321428571428 },{ 2.5, 1.2, 2.0833333333333335 },{ -666.99,-886622 ,7.522822578280259E-4 }
        };
    }

    @BeforeTest
    public void beforeTest()
    {
        //System.out.println("This is before test");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        //System.out.println("This is before Suite");
    }

    @BeforeClass
    public void beforeClass()
    {
        //System.out.println("This is before Class");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod()
    {
        System.out.println("This is before Method");
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void AfterMethod()
    {
        //System.out.println("This is after Method");
        //calculator = null;
    }
    @AfterSuite(alwaysRun = true)
    public void AfterSuite()
    {
        System.out.println("This is after Suite");
        calculator = null;
    }

}
