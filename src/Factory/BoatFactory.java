package Factory;

public class BoatFactory extends Factory {
    @Override
    public Transport crateTransportWay() {
        return new Boat();
    }
}
