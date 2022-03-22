package Composite;

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> component = new ArrayList<>();

    public boolean add(Component component){
        return this.component.add(component);
    }

    public boolean remove(int index){
        try {
            this.component.remove(index);
        } catch (IndexOutOfBoundsException e){
            return false;
        }
        return true;
    }

    public ArrayList<Component> getComponent() {
        return component;
    }

    @Override
    public int execute() {
        int result = 0;
        System.out.println("Item list :");
        for (Component component1 : component){
            if(component1 instanceof ComplexObject complexObject){
                result += complexObject.execute();
            } else {
                System.out.println("   - " + ((SimpleObject) component1).getComponents() +
                        " = " + ((SimpleObject) component1).getComponents().getPrice());
                result += ((SimpleObject) component1).getComponents().getPrice();
            }
        }
        System.out.println(" Total price = " + result + "$");
        return result;
    }
}
