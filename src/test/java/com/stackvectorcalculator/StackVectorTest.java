package com.stackvectorcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StackVectorTest {
    @Test
    public void shouldPushElementToTop() {
        final StackVector<Integer> stackVector = new StackVector<Integer>();
        stackVector.push(1);

        assertEquals(Integer.valueOf(1), stackVector.peek());
    }

    @Test
    public void shouldRemoveLastElementPushed() {
        final StackVector<Integer> stackVector = new StackVector<Integer>();
        stackVector.push(1);
        stackVector.push(2);

        stackVector.pop();

        assertEquals(Integer.valueOf(1), stackVector.peek());
    }

    @Test
    public void shouldInitializeEmpty() {
        final StackVector<Integer> stackVector = new StackVector<Integer>();
        assertEquals(true, stackVector.empty());
    }
}
