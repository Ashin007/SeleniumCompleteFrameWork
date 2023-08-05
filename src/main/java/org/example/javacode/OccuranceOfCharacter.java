package org.example.javacode;

import java.util.HashSet;
import java.util.Set;

public class OccuranceOfCharacter {
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        String s = "Welcome to Wipro";
        char[] charracterArray = s.toCharArray();
        int count;
        Set<Character> data = new HashSet<>();
        for(int i=0;i<charracterArray.length;i++){
            count = 1;

            if(data.contains(charracterArray[i])){
                continue;
            }

            for(int j=i+1;j<charracterArray.length;j++){

                    if ( charracterArray[i] == charracterArray[j]) {

                        data.add(charracterArray[i]);
                        count++;
                    }

            }
            System.out.println(charracterArray[i]+"-->"+count);
        }

        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }
}
