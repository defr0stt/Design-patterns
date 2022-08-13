package Iterator;

import java.util.Arrays;
import java.util.Iterator;

// Iterable<E> to override iterator()
// Iterator<E> to override hasNext() and next()

public class BetterIterator<E> implements Iterable<E> {

    private E[] elementData;
    private int size;

    public void addLast(E element){
        if(size > 0)
            elementData = Arrays.copyOf(elementData,++size);
        else
            elementData = (E[]) new Object[++size];
        elementData[size-1] = element;
    }

    public void deleteLast(){
        if(size > 0)
            elementData = Arrays.copyOf(elementData,--size);
    }

    @Override
    public String toString() {
        return "BetterIterator{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator<E> iterator() {
        return new InsideIterator();
    }

    private class InsideIterator implements Iterator<E> {

        int pointer;

        @Override
        public boolean hasNext() {
            return pointer < size;
        }

        @Override
        public E next() {
            return elementData[pointer++];
        }
    }
}
