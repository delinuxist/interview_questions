package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulation {

    public String reverseStringWithStreams(String str) {
        StringBuilder result;

        String[] strArray = str.split("");

        List<String> strList = new ArrayList<>(
                Arrays.asList(strArray)
        );

       result = strList.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

       return result.reverse().toString();
    }

    public String reverseStringWithRecursion(String str) {
        return loop("",str);
    }

    private String loop(String stringBuilder,String str) {
        if(str.length() == 0) {
            return stringBuilder;
        } else {
            String value = str.charAt(0) +  stringBuilder;
            return loop(value,str.substring(1));
        }
    }

    public Long countCharactersWithStream(List<Character> charList) {
        return charList.stream().count();
    }

}
