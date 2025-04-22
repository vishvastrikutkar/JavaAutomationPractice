package DesignPatterns;

import DesignPatterns.BuilderPattern.Bicycle;

public class BuilderTest {

    public static void main(String[] args) {
        Bicycle.BicycleBuilder bicycleBuilder1 = new Bicycle.BicycleBuilder()
                .hasCarrier(true)
                .hasDoubleStand(true)
                .hasDoubleSeats(false)
                .hasGears(true);
        System.out.println(bicycleBuilder1);

        Bicycle.BicycleBuilder bicycleBuilder2 = new Bicycle.BicycleBuilder()
                .hasCarrier(true)
                .hasDoubleStand(true);

        System.out.println(bicycleBuilder2);

        Bicycle.BicycleBuilder bicycleBuilder3 = new Bicycle.BicycleBuilder();
        System.out.println(bicycleBuilder3);

    }


}
