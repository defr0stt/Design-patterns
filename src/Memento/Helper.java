package Memento;

import java.util.ArrayList;

public class Helper {
    private static ArrayList<Memento.MementoPhoto> mementos = new ArrayList<>();
    private Helper(){}

    public static boolean add(Memento.MementoPhoto memento){
        return mementos.add(memento);
    }

    public static boolean delete(int index){
        try{
            mementos.remove(index);
            return true;
        } catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    public static Memento.MementoPhoto get(int index){
        try{
            return mementos.get(index);
        } catch (IndexOutOfBoundsException e){
            return null;
        }
    }

    public static void list(){
        if (mementos.size()>0){
            for (Memento.MementoPhoto mementoPhoto : mementos){
                System.out.println(mementoPhoto);
            }
        } else {
            System.out.println("No mementos in list :(");
        }
    }
}
