package javasamples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftDigonal=0;
        int rightDiagonal=0;
        for(int i=0;i<arr.size();i++){
            for (int j=0;j<arr.get(0).size();j++){
                if(i==j)
                    leftDigonal= leftDigonal + arr.get(i).get(j);
                if(i+j==arr.get(0).size()-1)
                    rightDiagonal= rightDiagonal + arr.get(i).get(j);
            }
        }
        return Math.abs(leftDigonal-rightDiagonal);
    }
    public static void main(String[] args){
        List<Integer> row1= new ArrayList<>(Arrays.asList(11,2,4));
        List<Integer> row2= new ArrayList<>(Arrays.asList(4,5,6));
        List<Integer> row3= new ArrayList<>(Arrays.asList(10,8,-12));
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(row1);
        list.add(row2);
        list.add(row3);




        int result = diagonalDifference(list);

    }
}
