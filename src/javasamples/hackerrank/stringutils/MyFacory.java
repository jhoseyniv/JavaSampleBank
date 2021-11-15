package javasamples.hackerrank.stringutils;

import java.util.Scanner;

public class MyFacory {

    static class Food{
        public String getType(){
            return "food orderd...";
        }
    }
    static class Pizza extends Food{
        public String getType(){
            return "The factory returned class Pizza \n" +
                    "Someone ordered a Fast Food!";
        }

    }
    static class Cake extends Food{
        public String getType(){

            return "The factory returned class Cake \n" +
                    "Someone ordered a Dessert!";
        }

    }
    static class Factory{
        public Food getFood(String type){
            if(type.equalsIgnoreCase("Pizza")){
                return new Pizza();
            }
            else if(type.equalsIgnoreCase("cake")){
                return new Cake();

            }
            return null;
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String input= scan.nextLine();
        Factory fact =new Factory();
        System.out.println(fact.getFood(input).getType());
    }
}
