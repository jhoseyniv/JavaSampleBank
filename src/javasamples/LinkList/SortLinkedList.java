package javasamples.LinkList;
import java.util.LinkedList;

public class SortLinkedList {
    public static  void main(String args[]){
//        LinkedList<Integer> list = new LinkedList<Integer>(){
//            {
//                push(4);
//                push(2);
//                push(1);
//                push(3);
//            }
//        };
        LinkedList<Integer> list = new LinkedList<Integer>(){
            {
                push(-1);
                push(5);
                push(3);
                push(4);
                push(0);
            }
        };
        Integer min=0;
        Integer minPos=0;

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i) + " ,  ");
        }
        System.out.println("\n");
        for(int i=0; i<list.size();i++){
            int temp=list.get(i);
            min= list.get(i);
            minPos= i;
                for (int j =i; j < list.size(); j++) {
                    if (min >  list.get(j)) {
                        min = list.get(j);
                        minPos = j;
                    }

                }
            list.set(i, min);
            list.set(minPos, temp);
        }

        System.out.println("Sorted list....");
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i) + " ,  ");
        }


    }
}
