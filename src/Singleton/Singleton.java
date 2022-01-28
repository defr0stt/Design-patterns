package Singleton;

public class Singleton
{
    private static Singleton instance;
    private String information;

    private Singleton(String information){
        this.information = information;
    }

    public String getInformation() {
        return information;
    }

    public static Singleton getInstance(String information) {
        if(instance == null){
            instance = new Singleton(information);
        }
        return instance;
    }
}