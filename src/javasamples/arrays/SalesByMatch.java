package javasamples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        int socksPair=0;
        int[] counts= new int[101];
        for(int j:counts) counts[j]=0;
        for (int i=0;i<ar.size();i++)
            counts[ar.get(i)]=counts[ar.get(i)] + 1;

        for(int j=0;j<counts.length;j++)
             socksPair = socksPair + counts[j] /2 ;




        return socksPair;
    }

    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>(Arrays.asList(10, 20, 20 ,10 ,10, 30, 50, 10, 20));
        int r= sockMerchant(7,arr);
    }
}
