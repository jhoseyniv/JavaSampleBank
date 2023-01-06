package javasamples.lambada;

import java.util.ArrayList;
import java.util.Arrays;

interface Addable{
    int add(int a,int b);
}

public class PrintList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,5,6,7,8,9,111));
        numbers.forEach(n-> System.out.println("number is = "+n));
        Addable addable = (a,b) -> (a+b);
        System.out.println("add a , b is " + addable.add(100,200));
    }

}
