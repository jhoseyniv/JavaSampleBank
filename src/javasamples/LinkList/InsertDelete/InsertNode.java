package javasamples.LinkList.InsertDelete;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InsertNode {
    public static void main(String args[]){
        List<Integer> numbers = new LinkedList<Integer>();

        Scanner scanner = new Scanner(System.in);
        int sizeofInputarry=scanner.nextInt();
        scanner.nextLine();
        String  inputArray=scanner.nextLine();
        int counter =scanner.nextInt();
        scanner.nextLine();
        String[] list =inputArray.split(" ");
        for(int i=0; i<list.length;i++)
            numbers.add(i, Integer.valueOf(list[i]));

        while(counter >0) {
            String command=scanner.nextLine();
            String oprands = scanner.nextLine();
            String[] oprand = oprands.split(" ");

            if(command.equalsIgnoreCase("Insert")){
                int item = Integer.valueOf(oprand[1]);
                int index = Integer.valueOf(oprand[0]);
                //System.out.println("Insert Command= " + oprand[0] + " ,  " + oprand[1] );
                if(index > numbers.size())
                    numbers.add(Integer.valueOf(oprand[0]));
                else numbers.add(index,item);
            }
            if(command.equalsIgnoreCase("delete")){
                int index = Integer.valueOf(oprand[0]);
               // System.out.println("delete Command= " + oprand[0] );
                if(index<=numbers.size())  numbers.remove(index);
            }

            counter--;
        }
        for (Integer integer : numbers) {
            System.out.print(integer);
        }
    }
}
