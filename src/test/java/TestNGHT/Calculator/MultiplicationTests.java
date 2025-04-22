package TestNGHT.Calculator;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultiplicationTests extends BaseClass {

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"Sanity"})
    public void simpleMultiplication(int number1, int number2,int expectedResult)
    {
        Assert.assertEquals(expectedResult, calculator.mult(number1,number2));
    }

    @Test(groups = {"Multiplication"},dataProvider = "mulTestDataInteger")
    public void MultiplicationWithDataProvider(int number1, int number2, int expectedResult)
    {
        Assert.assertEquals(calculator.mult(number1,number2), expectedResult);
    }

    @Test(groups = {"Multiplication"},dataProvider = "mulTestDataDouble")
    public void doubleMultiplication(double number1, double number2,double expectedResult)
    {
        Assert.assertEquals(calculator.mult(number1,number2),expectedResult);
    }

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"NegativeTCs"})
    public void multiplicationNegative(int number1, int number2,int expectedResult)
    {
        Assert.assertNotEquals(expectedResult, calculator.mult(number1,number2));
    }

    @Parameters({"number1","number2"})
    @Test(groups = {"NegativeTCs"},expectedExceptions = NumberFormatException.class,enabled = false)
    public void multiplicationEmpty(int number1, int number2)
    {
        calculator.mult(number1, number2);
    }
}
