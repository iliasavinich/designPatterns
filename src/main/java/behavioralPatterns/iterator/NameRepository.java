package behavioralPatterns.iterator;

import java.util.Iterator;

public class NameRepository<T> implements Iterable<T> {

    private T[] names;

    public NameRepository(T... objects){
        names = objects;
    }

    @Override
    public Iterator<T> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public void reset() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index<names.length;
        }

        @Override
        public T next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}


