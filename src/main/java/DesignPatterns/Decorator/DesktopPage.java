package DesignPatterns.Decorator;

// Concrete page for Desktop -- Componant
public class DesktopPage implements WebSitePage {

    private int baseRank=20;

    public DesktopPage()
    {
        System.out.println("Creating Desktop page");
    }

    @Override
    public int getRank() {
        System.out.println("Desktop Page Rank "+baseRank);
        return baseRank;
    }
}
