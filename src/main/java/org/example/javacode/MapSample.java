package org.example.javacode;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {

        Map<Character,Integer> myMap = new HashMap<>();
        myMap.put('c',100);
        myMap.put('k',100);
        myMap.put('j',100);
        myMap.put('l',100);

        System.out.println(myMap);

        LocalTime time = LocalTime.now();
        System.out.println(time.toString().replaceAll("[:,.]",""));

    }
}
