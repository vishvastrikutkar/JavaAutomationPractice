package DesignPatterns;

import DesignPatterns.Singleton.CandyMaker;
import org.junit.Assert;

public class CandyMakerTest {

    public static void main(String[] args)
    {
        //This is not  allowed as we have made the constructor private
        //CandyMaker candyMaker = new CandyMaker();

        // Creating instance using public access method.
        CandyMaker candyMaker1  = CandyMaker.getCandyMaker();
        // Creating another object of CandyMaker using GET method.
        CandyMaker candyMaker2  = CandyMaker.getCandyMaker();

        // Print Hashcode for the object
        System.out.println(candyMaker1.hashCode());
        System.out.println(candyMaker2.hashCode());

        // Verify if both objects are same.
        Assert.assertEquals(candyMaker1,candyMaker2);
    }

}
