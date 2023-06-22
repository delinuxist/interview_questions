package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {



    Stack<Integer> underTest;

    @Test
    public void testStackPush() {
        Integer[] arr = new Integer[5];
        underTest = new Stack<>(arr);
        underTest.push(3);
        assertEquals(underTest.peek(),3);
    }

    @Test
    public void testStackOverFlowException() {
        Integer[] arr = new Integer[2];
        underTest = new Stack<>(arr);
        underTest.push(3);
        underTest.push(4);

        assertThrows(RuntimeException.class,()-> underTest.push(8));
    }

    @Test
    public void testStackPop() {
        Integer[] arr = new Integer[5];
        underTest = new Stack<>(arr);
        underTest.push(3);
        underTest.push(8);
        Integer result = underTest.pop();
        assertEquals(8,result);
    }

    @Test
    public void testUnderFlowException() {
        assertThrows(RuntimeException.class,()-> underTest.pop());
    }
}