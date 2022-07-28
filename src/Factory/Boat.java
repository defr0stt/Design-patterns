package Factory;

public class Boat implements Transport {
    @Override
    public String deliver() {
        return "Boat is swimming on the waves";
    }
}
