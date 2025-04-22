package DesignPatterns.Singleton;


public class CandyMaker {

    private boolean empty;
    private boolean boiled;

    // Private instance of the class
    private static CandyMaker candyMaker;

    // Private constructor
    private CandyMaker()
    {
        empty = true;
        boiled = false;
    }
    // 1. Singleton DP : Eager Initialization
    //private static CandyMaker candyMaker= new CandyMaker();

    // 2. Singleton DP : Static Block Initialization
    /*static {
        try{
        candyMaker = new CandyMaker();
        }catch (Exception e)
        {
            throw new RuntimeException("Exception occurred");
        }
    }*/

    /*// 3. Singleton DP : Lazy Initialization without Thread safety
    // Global Public access method
    public static CandyMaker getCandyMaker()
    {
        if(candyMaker==null) {
            candyMaker = new CandyMaker();
            }
        return candyMaker;
    }*/

    /*// 4. Singleton DP : Lazy Initialization with Thread safety
    // Global Public access method
    public static synchronized CandyMaker getCandyMaker()
    {
        if(candyMaker==null) {
            candyMaker = new CandyMaker();
            }
        return candyMaker;
    }*/

    // 5. Singleton DP : Lazy Initialization with Thread Safety with double-checked locking
    // Global Public access method
    public static CandyMaker getCandyMaker()
    {
        // Double-checked locking
        if(candyMaker==null) {
            synchronized (CandyMaker.class) {
                if(candyMaker==null) {
                    candyMaker = new CandyMaker();
                }
            }
        }
        return candyMaker;
    }

    //to fill the boiler it must be empty, and once its full,
    //we set the empty and boiled flags
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the candyMaker with milk and chocolate mix
        }
    }

    //To drain the boiler, it must be full(non-empty) and also boiled.
    //once it is drained, we set the empty back to true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    //to boil the mixture the boiler has to be full and not already boiled.
    //once its boiled we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
