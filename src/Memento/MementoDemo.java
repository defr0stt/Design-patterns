package Memento;

public class MementoDemo {
    public static void main(String[] args) {
        Memento memento = new Memento("Zack",18);
        memento.setName("Julia");
        memento.setAge(22);

        Helper.list();
    }
}
