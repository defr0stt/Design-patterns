package Factory;

public class Truck implements Transport {
    @Override
    public String deliver() {
        return "Truck is delivering your order";
    }
}
