package javasamples.LinkList;

import org.junit.jupiter.api.Test;

import java.util.*;

public class LeftRotation {

    public static List<Integer> rotatLeft(int d, List<Integer> arr) {
        // Write your code here
        List linkedList = new LinkedList();
        for(int j=0;j<arr.size();j++){
            linkedList.add(j,arr.get(j));
        }
        for(int i=0;i<d;i++) {
            int temp=(int)linkedList.get(0);
            linkedList.add(linkedList.size(),temp);
            linkedList.remove(0);
        }

        return linkedList;
    }

    public static List<Integer> rotateRight(int d, List<Integer> arr) {
        // Write your code here
        List linkedList = new LinkedList();
        for(int j=0;j<arr.size();j++){
            linkedList.add(j,arr.get(j));
        }
                for(int i=0;i<d;i++) {
                int temp=(int)linkedList.get(linkedList.size()-1);
                linkedList.add(0,temp);
                  linkedList.remove(linkedList.size()-1);
                }

        return linkedList;
    }

    public static void main(String args[]){
        List<Integer> arrLeft=new ArrayList<Integer>(){
            {add(1);add(2);add(3);add(4);add(5);add(6);add(7);add(8);add(9);add(10);}
        };
//         System.out.print("original array = ");
//        for(int i=0;i<arrLeft.size();i++)
//            System.out.print(arrLeft.get(i) +" , ");
//
//
//        arrLeft =rotateLeft(4,arrLeft,0);
//
//        System.out.println("Shifted array = ");
//        for(int i=0;i<arrLeft.size();i++)
//            System.out.print(arrLeft.get(i) +" , ");


        List<Integer> arrRigth=new ArrayList<Integer>(){
            {add(1);add(2);add(3);add(4);add(5);}
        };
        System.out.print("original array = ");
        for(int i=0;i<arrRigth.size();i++)
            System.out.print(arrRigth.get(i) +" , ");

        arrRigth =rotatLeft(3,arrRigth);

        System.out.println("Shifted array = ");
        for(int i=0;i<arrRigth.size();i++)
            System.out.print(arrRigth.get(i) +" , ");

    }



}
