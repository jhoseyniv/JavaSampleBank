package javasamples.String2021;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringTokens {

    public static  void tokentize(){
        Scanner scanner= new Scanner(System.in);
        String s=scanner.nextLine();
        s=s.replaceAll("[',\\?._'@+]"," ");
        StringTokenizer stringTokenizer= new StringTokenizer(s);
        System.out.println(stringTokenizer.countTokens());
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

    }
    public static void comipleRegex(String input){
        Pattern pattern = Pattern.compile(input);
        Matcher matcher = pattern.matcher("INPUT");

        boolean matches = matcher.matches();
        if(matches)  System.out.println("Valid");
        else       System.out.println("Invalid");

    }
    public static void main(String args[]){

    }
}
