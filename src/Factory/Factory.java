package Factory;

// It is a generating design pattern that solves the problem
// of creating different products without binding the code to specific product classes.

public abstract class Factory
{
    public String delivering()
    {
        FactoryInterface factoryInterface = createWayToDeliver();
        return factoryInterface.deliver();
    }

    protected abstract FactoryInterface createWayToDeliver();
}

class ByCar implements FactoryInterface
{
    @Override
    public String deliver() {
        return "delivering by car";
    }
}

class ByShip implements FactoryInterface
{

    @Override
    public String deliver() {
        return "delivering by ship";
    }

}

class Road extends Factory
{
    @Override
    public FactoryInterface createWayToDeliver() {
        return new ByCar();
    }
}

class Sea extends Factory
{
    @Override
    public FactoryInterface createWayToDeliver() {
        return new ByShip();
    }
}

interface FactoryInterface
{
    String deliver();
}