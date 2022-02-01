package javasamples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist1 {
    public static  void main(String[] args){
       ArrayList<ArrayList<Integer>> lists= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l=null;
        Scanner scanner= new Scanner(System.in);
        String readString="";
        Integer numberofLists = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<numberofLists;i++){
            int counter=0;
            l= new ArrayList<Integer>();
                String numbers = scanner.nextLine();
                String[] values = numbers.split(" ");
                for(int j=0; j< values.length; j++) {

                    l.add(j, Integer.valueOf(values[j]));
                }
            lists.add(i,l);
        }

        Integer queries = scanner.nextInt();
        scanner.nextLine();
        for(int k=0;k<queries;k++){
            String numbers = scanner.nextLine();
            String[] query = numbers.split(" ");
            int x= Integer.valueOf(query[0]);
            int y = Integer.valueOf(query[1]);
           if(x<lists.size()) {
               l = lists.get(x);
               if(y<l.size()) {
                   System.out.println(lists.get(x).get(y));
               }
               else{
                   System.out.println("ERROR!");
               }
           }else {
               System.out.println("ERROR!");
           }
        }

    }
}
