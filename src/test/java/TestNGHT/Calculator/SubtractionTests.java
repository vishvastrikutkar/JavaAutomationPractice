package TestNGHT.Calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class SubtractionTests extends BaseClass {

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"Sanity"})
    public void simpleSubtraction(int number1, int number2,int expectedResult)
    {
        Assert.assertEquals(expectedResult, calculator.sub(number1,number2));
    }

    @Test(groups = {"Subtraction"},dataProvider = "subTestDataInteger")
    public void subtractionWithDataProvider(int number1, int number2, int expectedResult)
    {
        Assert.assertEquals(calculator.sub(number1,number2), expectedResult);
    }

    @Test(groups = {"Subtraction"},dataProvider = "subTestDataDouble")
    public void doubleSubtraction(double number1, double number2,double expectedResult)
    {
        Assert.assertEquals(calculator.sub(number1,number2),expectedResult);
    }

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"NegativeTCs"})
    public void subtractionNegative(int number1, int number2,int expectedResult)
    {
        Assert.assertNotEquals(expectedResult, calculator.sub(number1,number2));
    }

    @Parameters({"number1","number2"})
    @Test(groups = {"NegativeTCs"},expectedExceptions = NumberFormatException.class,enabled = false)
    public void subtractionEmpty(int number1, int number2)
    {
        calculator.sub(number1, number2);
    }

}
