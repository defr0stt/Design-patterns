package Factory;

public class FactoryLogistic {
    private Factory factory;
    private Logistic logistic;

    FactoryLogistic(){}
    FactoryLogistic(Logistic logistic){
        this.logistic = logistic;
    }

    public Logistic getLogistic() {
        return logistic;
    }

    public void setLogistic(Logistic logistic) {
        this.logistic = logistic;
    }

    public void deliveringProcess(Logistic logistic){
        setLogistic(logistic);
        deliveringProcess();
    }

    public void deliveringProcess(){
        if(logistic != null) {
            if (logistic == Logistic.EARTH)
                factory = new EarthFactory();
            else if (logistic == Logistic.SKY)
                factory = new PlaneFactory();
            else if (logistic == Logistic.SEA)
                factory = new BoatFactory();
            factory.deliverOrder();
        } else
            try {
                throw new Exception("Unknown delivering way");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
