package practice26;

import java.util.*;

public class ListIterator<E> implements Iterator<E> {
    private final List<E> list;
    private int currentIndex;
    private boolean canRemove;

    public ListIterator(List<E> list) {
        this.list = list;
        this.currentIndex = 0;
        this.canRemove = false;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the list");
        }
        canRemove = true;
        return list.get(currentIndex++);
    }

    @Override
    public void remove() {
        if (!canRemove) {
            throw new IllegalStateException("Next method has not been called, or remove has already been called after the last next");
        }
        list.remove(--currentIndex);
        canRemove = false;
    }
}
