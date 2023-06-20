package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringManipulationTest {

    StringManipulation underTest = new StringManipulation();

    String str = "hey there";
    String strOutput = "ereht yeh";


    @Test
    public void testReverseStringWithStreams() {
        String result = underTest.reverseStringWithStreams(str);

        assertEquals(result,strOutput);
    }

    @Test
    public void testReverseStringWithRecursion() {
        String result = underTest.reverseStringWithRecursion(str);

        assertEquals(result,strOutput);
    }
}