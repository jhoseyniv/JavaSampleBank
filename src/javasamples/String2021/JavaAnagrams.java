package javasamples.String2021;

import java.util.*;
//Two strings, and , are called anagrams if they contain all the same characters in the same frequencies. 
//For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
public class JavaAnagrams {
    public static  boolean isAnagram2(String a, String b) {
         boolean anagram=false;
        StringBuilder sb = new StringBuilder(b);
       if(a.length() != b.length()) return anagram;
       for (int i=0; i<a.length();i++){
            Character character = a.charAt(i);
            int loc =sb.indexOf(String.valueOf(character));
            if(loc>=0 ) sb.deleteCharAt(loc);
        }

        if(sb.isEmpty()) anagram=true;
    return  anagram;
    }
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static  boolean isAnagram(String a, String b) {
        boolean anagram=false;
        a= a.toLowerCase();
        b= b.toLowerCase();

        if(a.length() != b.length()) return anagram;
        for (int i=0; i<a.length();i++){
            Character character = a.charAt(i);
            int loc =b.indexOf(character);
            if(loc>=0 )  b=charRemoveAt(b, loc);
        }
        Date  d= new Date();

        if(b.length()==0) anagram=true;
        return  anagram;
    }

    public static void main(String args[]){
        isAnagram("Hello", "hello");
    }
}
