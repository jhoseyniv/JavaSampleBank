package javasamples.Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Experssion {

    public static boolean  checkExperssion(String input){
        int i = 0;
        Stack<Character> validexperssion = new Stack<Character>();
        boolean isvalid = false;
        for (i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[')
                validexperssion.push(input.charAt(i));
            else {
                if (!validexperssion.isEmpty()) validexperssion.pop();
                else return false;
            }
        }

        if (validexperssion.isEmpty() ) isvalid = true;
        else isvalid = false;
     return isvalid;
    }
    public static void JavaHashMap(){

        int t = 5;
        String [] pair_left = {
                "john ",

                "john" ,

                "john" ,

               "mary" ,

                "mary" ,
        };

        String [] pair_right = {
                "tom",

                "mary" ,

                "tom" ,

                "anna" ,

                "anna" ,
        };
        HashMap<String,String> hashMap= new HashMap<>();
        for(int i=0;i<t; i++){
          //  if( !hashMap.containsKey(pair_left[i]) || !hashMap.containsValue(pair_right[i]) )
                hashMap.put(pair_left[i], pair_right[i]);
                 System.out.println(hashMap.size());
        }

    }
    public static void JavaHashSet(){

        int t = 5;
        String [] pair_left = {
                "john ",

                "john" ,

                "john" ,

                "mary" ,

                "mary" ,
        };

        String [] pair_right = {
                "tom",

                "mary" ,

                "tom" ,

                "anna" ,

                "anna" ,
        };
        HashSet<String> hashSet= new HashSet<>();
        for(int i=0;i<t; i++){
            hashSet.add(pair_left[i] +"_"+ pair_right[i]);
            System.out.println(hashSet.size());
        }
    }
    public static int divisor_sum(int n){
        int sum=n+1;
        for( int i=2;i<n;i++){
            if(n%i==0) sum += sum;
        }
        return sum;
    }
    public static void main(String args[]) {
        divisor_sum(6);

    }
    }

