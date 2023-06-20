package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();

        String result1 = stringManipulation.reverseStringWithStreams("hello world");
        String result2 = stringManipulation.reverseStringWithRecursion("hero");
        Long result3 = stringManipulation.countCharactersWithStream(List.of('a','b','c'));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}