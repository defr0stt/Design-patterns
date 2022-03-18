package AbstractFactory;

public interface AbstractFactory
{
    public abstract VideoCard createVideoCard();
    public abstract CPU createCPU();
    public abstract RAM createRAM();
}