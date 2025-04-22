package TestNGHT.Calculator;

import org.testng.Assert;
import org.testng.annotations.*;


public class AdditionTests extends BaseClass {

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"Sanity"})
    public void simpleAddition(int number1, int number2,int expectedResult)
    {
        Assert.assertEquals(expectedResult, calculator.sum(number1,number2));
    }

    @Test(groups = {"Addition"},dataProvider = "sumTestDataInteger")
    public void additionWithDataProvider(int number1, int number2, int expectedResult)
    {
        Assert.assertEquals(calculator.sum(number1,number2), expectedResult);
    }

    @Test(groups = {"Addition"},dataProvider = "sumTestDataDouble")
    public void doubleAddition(double number1, double number2,double expectedResult)
    {
        Assert.assertEquals(calculator.sum(number1,number2),expectedResult);
    }

    @Parameters({"number1","number2","expectedResult"})
    @Test(groups = {"NegativeTCs"})
    public void additionNegative(int number1, int number2,int expectedResult)
    {
        Assert.assertNotEquals(expectedResult, calculator.sum(number1,number2));
    }

    @Parameters({"number1","number2"})
    @Test(groups = {"NegativeTCs"},expectedExceptions = NumberFormatException.class,enabled = false)
    public void additionEmpty(int number1, int number2)
    {
        try{
            calculator.sum(number1, number2);
        }catch (Exception e)
        {
            System.out.println("Exception");
        }
    }
    @Ignore
    @Test(groups = {"NegativeTCs"},enabled = false)
    public void additionFailed()
    {
        Assert.fail();
    }






}
