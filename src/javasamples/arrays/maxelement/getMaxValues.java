package javasamples.arrays.maxelement;

import java.util.*;

public class getMaxValues {

    public static void push(int data,Stack<Integer> st,Stack<Integer> maxSt) {
        int max = data;
        if(!maxSt.isEmpty() && max < maxSt.peek()) {
            max = maxSt.peek();
        }
        st.push(data);
        maxSt.push(max);
    }

    public static List<Integer> getMax(List<String> operations) {
    List<Integer> rsults= new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        Stack<Integer> stackSorted=new Stack<Integer>();
        Integer max=0;
        String[] parts = new String[2];
       Comparator myComparetor= new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

    for (int i=0;i<operations.size();i++){
        parts= operations.get(i).split(" ");
        if(parts[0].equals("1")){
           push(Integer.valueOf(parts[1]),stack,stackSorted);
        }
        else if(parts[0].equals("2")){
            stackSorted.pop();
       }
       else  if(parts[0].equals("3")){
            if(!stackSorted.isEmpty()){
                   max= stackSorted.peek();

            }
            rsults.add(max);
        }
     }
        return  rsults;
    }
    public static void main(String[] args){
        List<String> operations= new ArrayList<>(Arrays.asList("1 97","2","1 20","1 98","1 20","3"));
        getMax(operations);
    }
}
