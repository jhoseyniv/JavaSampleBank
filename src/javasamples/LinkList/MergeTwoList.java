package javasamples.LinkList;

import java.util.*;

public class MergeTwoList {

    public static Comparator<Integer> myComparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };

    public static void main(String args[]){
        //List<Integer> list1= new LinkedList<Integer>(Arrays.asList(1,3,7,9));
        //List<Integer> list2=new LinkedList<Integer>(Arrays.asList(0,2,4,6,7,11));

        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        String s="";
        for(int i=0; i<n;i++) {
            s = scanner.nextLine();
            int num = Integer.valueOf(s);
            list1.add(num);
        }
        int m = scanner.nextInt();
        String s2="";
        for(int i=0; i<m;i++) {
            s2 = scanner.nextLine();
            int num2 = Integer.valueOf(s2);
            list2.add(num2);
        }

        list1.addAll(list2);
        list1.sort(myComparator);

        for(int i=0;i<list1.size();i++)
            System.out.print(" "+ list1.get(i));
    }
}
