package DesignPatterns.BuilderPattern;

public class Bicycle {

    private boolean hasTyres;
    private boolean hasBreaks;

    private boolean hasDoubleStand;
    private boolean hasGears;
    private boolean hasDoubleSeats;
    private boolean hasCarrier;

    private Bicycle(BicycleBuilder bicycleBuilder)
    {
        this.hasDoubleStand=bicycleBuilder.hasDoubleStand;
        this.hasGears = bicycleBuilder.hasGears;
        this.hasCarrier = bicycleBuilder.hasCarrier;
        this.hasDoubleSeats = bicycleBuilder.hasDoubleSeats;
    }

    public static class BicycleBuilder {
        private boolean hasDoubleStand=false;
        private boolean hasGears=false;
        private boolean hasDoubleSeats=false;
        private boolean hasCarrier=false;
        private boolean hasBreaks=false;
        private boolean hasTyres=false;

        public BicycleBuilder()
        {
            this.hasBreaks = true;
            this.hasTyres = true;
        }

        public BicycleBuilder hasDoubleStand(Boolean hasDoubleStand)
        {
            this.hasDoubleStand = hasDoubleStand;
            return this;
        }
        public BicycleBuilder hasGears(Boolean hasGears)
        {
            this.hasGears = hasGears;
            return this;
        }
        public BicycleBuilder hasDoubleSeats(Boolean hasDoubleSeats)
        {
            this.hasDoubleSeats = hasDoubleSeats;
            return this;
        }
        public BicycleBuilder hasCarrier(Boolean hasCarrier)
        {
            this.hasCarrier = hasCarrier;
            return this;
        }

        @Override
        public String toString()
        {
            return "Bicycle{" +
                    "hasGears=" + hasGears +
                    ", hasDoubleStand=" + hasDoubleStand +
                    ", hasDoubleSeats=" + hasDoubleSeats +
                    ", hasCarrier=" + hasCarrier +
                    ", hasBreaks=" + hasBreaks +
                    ", hasTyres=" + hasTyres +
                    '}';
        }
    }

}
