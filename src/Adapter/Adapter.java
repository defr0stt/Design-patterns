package Adapter;

// It's a structural design pattern that gives
// opportunity objects with incompatible interfaces
// work together.
//
// Separates and hides from the client the details of the conversion
// different interfaces.
//
// Complicates the program code due to the adding of additional
// classes.

public class Adapter
{
    static public boolean checkEngine(Engine engine, int min, int max){
        if(engine.getPower() >= min && engine.getPower() <= max){
            System.out.println(engine + " fits to this type of vehicle");
            return true;
        } else {
            System.out.println(engine + " doesn't fit to this type of vehicle");
            return false;
        }
    }

    static public void adaptEngine(Vehicle vehicle, Engine engine, boolean put){
        if(vehicle.getMin() <= engine.getPower() && vehicle.getMax() >= engine.getPower()){
            System.out.println("This engine : " + engine + " not required to be adapted");
            if(put){
                vehicle.setEngine(engine);
            }
        } else if(vehicle.getMin() > engine.getPower()) {
            System.out.println("This engine : " + engine + " adapted to minimum " + vehicle.getMin() + "HP");
            Engine tempEngine = new Engine(engine);
            tempEngine.setPower(vehicle.getMin());
            if(put){
                vehicle.setEngine(tempEngine);
            }
        } else if(vehicle.getMax() < engine.getPower()) {
            System.out.println("This engine : " + engine + " adapted to maximum " + vehicle.getMax() + "HP");
            Engine tempEngine = new Engine(engine);
            tempEngine.setPower(vehicle.getMax());
            if(put){
                vehicle.setEngine(tempEngine);
            }
        }
    }
}