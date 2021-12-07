package javasamples.arrays;

import java.util.ArrayList;

public class JavaGeneric {

    static class Printer
    {
        public void printArray(Object[] input ){
            String arrayClass= input.getClass().getSimpleName();
            if(arrayClass.equalsIgnoreCase("Integer[]")) {
                for(int i=0; i<input.length;i++)
                    System.out.println((Integer)input[i]);
            }
            if(arrayClass.equalsIgnoreCase("String[]")) {
                for(int i=0; i<input.length;i++)
                    System.out.println((String)input[i]);
            }
        }

    }

    public static  void main(String[] args){
        Printer myPrinter = new Printer();

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }

}
