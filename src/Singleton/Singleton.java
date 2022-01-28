package Singleton;

// This is a generative design pattern that ensures that the class
// has only one instance and provides a global access point to it.

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