package org.example.javacode;

public class ExceptionSample {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println("Arithematic excpeion"+e.getMessage());
        }

//        if(b<=1){
//            throw new ArithmeticException();
//        }
//        else{
//            System.out.println("We are good");
//        }
    }
}
