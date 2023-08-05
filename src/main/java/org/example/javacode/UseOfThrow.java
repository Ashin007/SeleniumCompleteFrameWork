package org.example.javacode;

public class UseOfThrow {

    public static void main(String[] args){


            MyTest(0);

    }

    public static void MyTest(int value) {
        if(value<=0){
            try {
                throw new ClassNotFoundException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("exception recovered");
            }
        }
        else{
            System.out.println("We are good");
        }
    }
}
