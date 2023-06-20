package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();

        String result1 = stringManipulation.reverseStringWithStreams("hello world");
        String result2 = stringManipulation.reverseStringWithRecursion("hero");
        var result3 = stringManipulation.countCharactersWithStream(List.of('a','b','b','c'));

        var result4 = stringManipulation.mostCommonCharacter(List.of('a','b','b','c','c'));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }
}