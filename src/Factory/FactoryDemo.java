package Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryLogistic factoryLogistic = new FactoryLogistic();
        factoryLogistic.deliveringProcess();
        factoryLogistic.deliveringProcess(Logistic.EARTH);
    }
}
