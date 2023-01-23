package com.stackvectorcalculator;

import java.util.EmptyStackException;
import java.util.Vector;

public class StackVector<E> implements Stack<E> {
    protected Vector<E> data = new Vector<E>(1);

    @Override
    public void push(E item) {
        data.addElement(item);

    }

    @Override
    public E pop() throws EmptyStackException {
        return data.remove(data.size() - 1);
    }

    @Override
    public E peek() throws EmptyStackException {
        return data.lastElement();
    }

    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

}
