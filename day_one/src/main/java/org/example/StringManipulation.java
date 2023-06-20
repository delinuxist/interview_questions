package org.example;

import java.util.*;
import java.util.stream.Collectors;

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

    public Map<Character,Long> countCharactersWithStream(List<Character> charList) {
        Map<Character,Long> characters;

        characters = charList.stream().collect(
                Collectors.groupingBy(character -> character,Collectors.counting())
        );

        return characters;
    }

    public List<Character> mostCommonCharacter(List<Character> charList) {
        Map<Character,Long> characterCount = countCharactersWithStream(charList);

        Optional<Long> max = characterCount.values().stream().max(Comparator.naturalOrder());

        return characterCount.entrySet().stream().filter(c-> Objects.equals(c.getValue(), max.get())).map(Map.Entry::getKey).toList();
    }




}
