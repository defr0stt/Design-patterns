package Factory;

// It is a generating design pattern that solves the problem
// of creating different products without binding the code to specific product classes.

public abstract class Factory
{
    public String delivering(FactoryInterface factoryInterface1)
    {
        FactoryInterface factoryInterface = createWayToDeliver(factoryInterface1);
        return factoryInterface.deliver();
    }

    protected abstract FactoryInterface createWayToDeliver(FactoryInterface factoryInterface);
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
    public FactoryInterface createWayToDeliver(FactoryInterface factoryInterface) {
        if(factoryInterface instanceof ByCar)
            return new ByCar();
        else {
            return new ByBike();
        }
    }
}

class Sea extends Factory
{
    @Override
    public FactoryInterface createWayToDeliver(FactoryInterface factoryInterface) {
        if(factoryInterface instanceof ByShip)
            return new ByShip();
        else {
            return new ByBoat();
        }
    }
}

interface FactoryInterface
{
    String deliver();
}