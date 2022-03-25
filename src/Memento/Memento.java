package Memento;

import java.time.LocalDateTime;

public class Memento {

    private Memento memento;

    String name;
    Integer age;

    public Memento(String name, Integer age){
        this.name = name;
        this.age = age;
        memento = new Memento();
        memento.name = this.name;
        memento.age = this.age;
        save();
    }

    private Memento(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        save();
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        save();
        this.age = age;
    }

    public MementoPhoto save(){
        MementoPhoto temp = new MementoPhoto(memento);
        Helper.add(temp);
        return temp;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public void restore(MementoPhoto memento){
        this.memento = new Memento(memento.getMemento().getName(),memento.getMemento().getAge());
    }

    @Override
    public String toString() {
        return "Memento{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    class MementoPhoto {
        private Memento memento;
        private LocalDateTime localDateTime;
        MementoPhoto(Memento memento){
            this.memento = memento;
            localDateTime = LocalDateTime.now();
        }

        public Memento getMemento() {
            return memento;
        }

        @Override
        public String toString() {
            return "MementoPhoto{" +
                    "memento=" + memento +
                    ", time=" + localDateTime.getHour() + ":" + localDateTime.getMinute() +
                    ":" + localDateTime.getSecond() + " " + localDateTime.getDayOfMonth() +
                    "/" + localDateTime.getMonthValue() + "/" + localDateTime.getYear() +
                    '}';
        }
    }
}
