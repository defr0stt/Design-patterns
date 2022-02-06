package Factory;

// It is a generating design pattern that solves the problem
// of creating different products without binding the code to specific product classes.

public abstract class Factory
{
    public static Factory way(String way){
        switch (way){
            case "Road": return new Road();
            case "Sea": return new Sea();
            default: return null;
        }
    }

    public abstract FactoryInterface vehicleWay(String line);

    public String delivering(FactoryInterface factoryInterface1) {
        return factoryInterface1.deliver();
    }
}

class ByCar implements FactoryInterface
{
    @Override
    public String deliver() {
        return "road delivering by car";
    }

}

class ByBike implements FactoryInterface
{
    @Override
    public String deliver() {
        return "road delivering by bike";
    }
}

class ByShip implements FactoryInterface
{
    @Override
    public String deliver() {
        return "sea delivering by ship";
    }
}

class ByBoat implements FactoryInterface
{
    @Override
    public String deliver() {
        return "sea delivering by boat";
    }
}

class Road extends Factory
{
    @Override
    public FactoryInterface vehicleWay(String line) {
        switch (line){
            case "Car": return new ByCar();
            case "Bike": return new ByBike();
            default: return null;
        }
    }
}

class Sea extends Factory
{
    @Override
    public FactoryInterface vehicleWay(String line) {
        switch (line){
            case "Ship": return new ByShip();
            case "Boat": return new ByBoat();
            default: return null;
        }
    }
}

interface FactoryInterface
{
    String deliver();
}