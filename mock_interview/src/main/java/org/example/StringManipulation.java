package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StringManipulation {

    public void reverseString(String str) {
       char[] charStr = str.toCharArray();
        Map<Character,Integer> specialChars = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

       for (int i =0; i < charStr.length;i++) {
          if(!Character.isAlphabetic(charStr[i])) {
              specialChars.put(charStr[i],i);
              continue;
          }
          stringBuilder.insert(0,charStr[i]);
       }

        for(Map.Entry<Character,Integer> entry: specialChars.entrySet()) {
            stringBuilder.insert((int) entry.getValue(),entry.getKey());
        }


        System.out.println(stringBuilder);
    }

}
