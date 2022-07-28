package Factory;

public class Plane implements Transport {
    @Override
    public String deliver() {
        return "Plane is flying higher than eagle";
    }
}
