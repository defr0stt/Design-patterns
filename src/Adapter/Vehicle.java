package Adapter;

public abstract class Vehicle
{
    public abstract Engine getEngine();
    public abstract void setEngine(Engine engine);
    public abstract void deleteEngine();
    public abstract int getMin();
    public abstract int getMax();
}