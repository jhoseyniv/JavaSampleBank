package javasamples.sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortBycomparetor {

     public static   Comparator<Integer> myComparetorASC = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2); // compare asending
        }
    };

    public static  Comparator<Integer> myComparetorDESC= new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    };

    @Test
    public static void testSortListByComprators(){
        ArrayList<Integer> input = new ArrayList<Integer>(){
            {
                add(10);
                add(23);
                add(-98);
                add(13);
                add(22);
                add(-23);
                add(0);
            }
        };

        ArrayList<Integer> output= new ArrayList<Integer>(){
            {
                add(-98);
                add(-23);
                add(0);
                add(10);
                add(13);
                add(22);
                add(23);
            }
        };

        input.sort(myComparetorASC);

        Assert.assertArrayEquals(input.toArray(), output.toArray());
        Assert.assertArrayEquals(input.toArray(), new ArrayList<Integer>(Arrays.asList(1,2,3,4)).toArray());



    }



    public static void main(String args[]){


        testSortListByComprators();

    }



}
