package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort underTest = new BubbleSort();


    @Test
    public void testSimpleBubbleSort() {
        int[] intArray = {20,35,-15,7,55,1,-22};

        int[] result = underTest.sort(intArray);

        int[] expected = {-22,-15,1,7,20,35,55};

        assertArrayEquals(expected,result);
    }
}