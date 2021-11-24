package javasamples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision1 {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count=0;
        int sum=0;
            for (int i = 0; i < s.size(); i++) {
                sum =0;
                for(int j=i;j<m+i;j++){
                   if(m+i<=s.size()) {
                      // System.out.print(s.get(j) + " ");
                       sum += s.get(j);
                   }

                }
                if(sum == d) count++;
               // System.out.println("sum="+sum);
            }
        //System.out.println("count="+count);
            return count;
        }


    public static void main(String[] args){
        List s= new ArrayList<Integer>(Arrays.asList(2,2,1,3,2));
        birthday(s,4,2);
    }
}
