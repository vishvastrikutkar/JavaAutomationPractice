package TestNGHT.Calculator;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DivisionTests extends BaseClass {

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"Sanity"})
    public void simpleDivision(int number1, int number2,int expectedResult)
    {
        Assert.assertEquals(expectedResult, calculator.div(number1,number2));
    }

    @Test(groups = {"Division"},dataProvider = "divTestDataInteger")
    public void divisionWithDataProvider(int number1, int number2, int expectedResult)
    {
        Assert.assertEquals(calculator.div(number1,number2), expectedResult);
    }

    @Test(groups = {"Division"},dataProvider = "divTestDataDouble")
    public void doubleDivision(double number1, double number2,double expectedResult)
    {
        Assert.assertEquals(calculator.div(number1,number2),expectedResult);
    }

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"NegativeTCs"})
    public void divisionNegative(int number1, int number2,int expectedResult)
    {
        Assert.assertNotEquals(expectedResult, calculator.div(number1,number2));
    }

    @Parameters({"number1","number2"})
    @Test(groups = {"NegativeTCs"},expectedExceptions = NumberFormatException.class,enabled = false)
    public void divisionEmpty(int number1, int number2)
    {
        calculator.div(number1, number2);
    }

    @Parameters({"number1","number2"})
    @Test(groups = {"NegativeTCs"},expectedExceptions = NumberFormatException.class)
    public void divisionByZero(int number1, int number2)
    {
        calculator.div(number1, number2);
    }






}
