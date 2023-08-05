package org.example.javacode;

public class SeperateNumber {

    public static void main(String[] args) {
        //“09/24/2015”.

        //approach 1
        String input = "“09/24/2015”.";
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
                if(Character.isDigit(ch))
                    System.out.println(ch);

        }

        //approach 2
        String numbersOnly = input.replaceAll("[^0-9]","");
        System.out.println(numbersOnly);
        char[] chars = numbersOnly.toCharArray();
        for(char digit:chars){
            int number = Character.getNumericValue(digit);
            System.out.println(number);
        }
    }
}
