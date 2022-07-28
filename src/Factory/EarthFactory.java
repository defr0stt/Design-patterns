package Factory;

public class EarthFactory extends Factory {
    @Override
    public Transport crateTransportWay() {
        return new Truck();
    }
}
