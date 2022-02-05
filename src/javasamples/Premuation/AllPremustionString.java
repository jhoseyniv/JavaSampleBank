package javasamples.Premuation;

import java.util.Scanner;

public class AllPremustionString {

    public static void printAllPermuation(String input){
        for(long i=0;i<Math.pow(2,input.length()) ; i++){

            String binaryString = Long.toBinaryString(i);
            System.out.print(i + " ) ");
            String withLeadingZeros = String.format("%"+input.length() + "s", binaryString).replace(' ', '0');
            for(int j=0; j<withLeadingZeros.length();j++){
                if(withLeadingZeros.charAt(j)!='0')
                        System.out.print( input.charAt(j));
            }
            System.out.println("");
        }
    }

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("All Premiuation of "+ input + " is : ");
        printAllPermuation(input);
    }
}
