package partA;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка сушей в коробках на грузовике.");
    }
}