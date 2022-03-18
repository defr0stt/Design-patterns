package Factory;

public abstract class Factory
{
    public void transportWay(Transport transport){
        transport.deliveringWay();
    }

    public void deliveringWay(Transport transport){
        transport.deliver();
    }

    public abstract Transport crateTransportWay();
}