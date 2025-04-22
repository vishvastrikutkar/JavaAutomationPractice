package DesignPatterns.Decorator;

// Concrete page for Mobile - Componant
public class MobilePage implements WebSitePage {

    private int baseRank=10;

    public MobilePage()
    {
        System.out.println("Creating Mobile page");
    }
    @Override
    public int getRank() {
        System.out.println("Mobile Page Rank "+baseRank);
        return baseRank;
    }
}
