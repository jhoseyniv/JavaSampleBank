package javasamples.String2021;

import java.util.ArrayList;
import java.util.Scanner;

public class FindStrings {

    public static void generateSubsets(String input){
        for(int i=0;i<input.length();i++){
            for(int j=0; j<input.length(); j++) {
                System.out.println(input.substring(i,j));
            }
        }
    }

    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter "+n + " String to Generate Subets...");
        ArrayList<String> inputs=new ArrayList<String>();
        for(int i=0; i<n; i++){
            inputs.add(scanner.nextLine());
        }


        //print inupt strings....
        for(int i=0; i<inputs.size();i++) {
            System.out.println(inputs.get(i));
            generateSubsets(inputs.get(i));
        }
    }
}
