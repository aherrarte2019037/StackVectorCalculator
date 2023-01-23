package com.stackvectorcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StackVectorTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        final StackVector<Integer> stackVector = new StackVector<Integer>();
        stackVector.push(1);

        assertEquals(Integer.valueOf(1), stackVector.peek());
    }
}
