package partA;

public abstract class Logistics {
    // Factory Method
    public abstract Transport createTransport();

    // Бизнес-логика работает только через интерфейсы
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}