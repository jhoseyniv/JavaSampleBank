package javasamples.String2021;

import java.util.Locale;
import java.util.Scanner;

public class StringIntro {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String A=scanner.next();
        String B=scanner.next();

        System.out.println(A.length()+B.length());

        if(A.compareTo(B)>0) System.out.println("Yes");
        else System.out.println("No");

        System.out.println(A.substring(0,1).toUpperCase(Locale.ROOT) + A.substring(1,A.length()));
        System.out.println(B.substring(0,1).toUpperCase(Locale.ROOT) + B.substring(1,B.length()));
    }
}
