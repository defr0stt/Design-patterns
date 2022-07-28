package Factory;

public class PlaneFactory extends Factory {
    @Override
    public Transport crateTransportWay() {
        return new Plane();
    }
}
