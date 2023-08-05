package org.example.javacode;

import java.util.*;

public class SortCollection {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer>myList = new ArrayList<>();
        for (int i=0;i<15;i++){
            myList.add(random.nextInt(100));
        }
        System.out.println("---------before sorting---");
        for(Integer integer:myList){
            System.out.println(integer);
        }
        Collections.sort(myList);
        System.out.println("---------after sorting---");
        for(Integer integer:myList){
            System.out.println(integer);
        }
    }
}
