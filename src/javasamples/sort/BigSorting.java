package javasamples.sort;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BigSorting {



    public static void main(String args[]){
        List<String> unsorted= new ArrayList<>(
                Arrays.asList("98765438877876868678678678678210","00000000001","00000000003","00000000010","00000000003","00000000005","3084193741")
        );


        BigInteger min=new BigInteger("1");
        BigInteger temp = new BigInteger("1");

        for (int i=0;i<unsorted.size();i++){
            min= new BigInteger(unsorted.get(i));
            int minIndex=i;
            for(int j=i+1; j<unsorted.size();j++){
                 temp = new BigInteger(unsorted.get(j));
                if(temp.compareTo(min)==-1 ) {
                    minIndex = j;
                    min = temp;
                }
            }
            String current=unsorted.get(i);
            unsorted.set(i,unsorted.get(minIndex));
            unsorted.set(minIndex,current);
        }
    }

}
