package javasamples.lambada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface Addable{
    int add(int a,int b);
}

public class PrintList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,5,6,7,8,9,111));
        numbers.forEach(n-> System.out.println("number is = "+n));
        Addable addable = (a,b) -> (a+b);
        System.out.println("add a , b is " + addable.add(100,200));


        //using predict method... functional interface....
        List<Integer> list = Arrays.asList(3,4,5,67,8,19,22,55,12,1,57,122,18,15,13);
        Predicate<Integer> gratThan10 = x -> x > 10;
        Predicate<Integer> lessThan80 = x -> x < 80;

        List<Integer> list2 = list.stream().filter(n -> n >10 && n <80).collect(Collectors.toList());
        System.out.println("list2= " + list2);

        List<Integer> list3 = list.stream().filter(gratThan10.and(lessThan80)).collect(Collectors.toList());
        System.out.println("list3= " + list3);

    }

}
