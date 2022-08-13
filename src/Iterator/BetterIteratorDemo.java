package Iterator;

import java.util.Iterator;

public class BetterIteratorDemo {
    public static void main(String[] args) {
        BetterIterator<PersonIterator> personIterators = new BetterIterator<PersonIterator>();
        personIterators.addLast(new PersonIterator("Zack", 12, "Male"));
        personIterators.addLast(new PersonIterator("Nick", 35, "Male"));
        personIterators.addLast(new PersonIterator("Mia", 19, "Female"));
        personIterators.addLast(new PersonIterator("Riley", 29, "Female"));
        personIterators.deleteLast();

        Iterator<PersonIterator> iterator = personIterators.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println(personIterators);
    }
}
