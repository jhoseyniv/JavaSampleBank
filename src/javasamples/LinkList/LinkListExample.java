package javasamples.LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListExample {


    public static void main(String args[]){
        LinkedList<Integer> myLinkList= new LinkedList<Integer>(List.of(4,3,25,6,-19,35,23,1,67,3,-2,0));
        Iterator<Integer> listIterator = myLinkList.descendingIterator();
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next()+" ");

        }
    }
}
