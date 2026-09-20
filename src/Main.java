import partA.Logistics;
import partA.RoadLogistics;
import partA.SeaLogistics;
import partB.Application;
import partB.GUIFactory;
import partB.MacFactory;
import partB.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Part A: Factory Method ===");
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

        System.out.println("\n=== Part B: Abstract Factory ===");
        GUIFactory windowsFactory = new WindowsFactory();
        Application winApp = new Application(windowsFactory);
        winApp.paint();

        System.out.println("\nСмена платформы на macOS:");
        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();
    }
}