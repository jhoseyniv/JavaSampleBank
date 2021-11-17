package javasamples.numbertheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int negavtive=0;
        int zero=0;
        int positive=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0 ) positive++;
            if(arr.get(i)==0) zero++;
            if(arr.get(i) <0 ) negavtive++;
        }
        System.out.printf("%4f\n",(float)positive/arr.size());
        System.out.printf("%4f\n",(float)negavtive/arr.size());
        System.out.printf("%4f\n",(float)zero/arr.size());

    }

    public static void main(String args[]){
        List arr=new ArrayList(){
            {add(-4); add(3); add(-9); add(0); add(4); add(1);
            }
        };
        List arr2= new ArrayList<Integer>(Arrays.asList(1,2,3,-4));

        plusMinus(arr);
    }
}
