package javasamples.arrays;

import java.util.*;

public class ArrayManipulation {


    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();
        queries.add(new ArrayList<>(Arrays.asList(2, 6, 8)));
        queries.add(new ArrayList<>(Arrays.asList(3, 5, 7)));
        queries.add(new ArrayList<>(Arrays.asList(1, 8, 1)));
        queries.add(new ArrayList<>(Arrays.asList(5, 9, 15)));

        int n=10;
        
        ArrayList<Long>  list= new ArrayList<Long>(Arrays.asList(new Long[n]));
        Collections.fill(list,0L);

        for(int j=0;j<queries.size();j++){
            int from= queries.get(j).get(0);
            int to= queries.get(j).get(1);
            int value= queries.get(j).get(2);

            for(int i=from-1;i<to;i++) {
                long current = list.get(i);
                list.set(i,current+value);
            }
        }

        System.out.println( Collections.max(list));

        }





}
