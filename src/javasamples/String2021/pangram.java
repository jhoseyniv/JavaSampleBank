package javasamples.String2021;

public class pangram {

    public static String pangrams(String s) {
        // Write your code here
        String isPanagram="pangram";
        String isNotPanagram="not pangram";
        int[] check= new int[26];
        int index=0;
        for(int i=0;i<s.length();i++){
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                index= s.charAt(i)-'A';
                check[index]= 100;
            }
            if('a'<= s.charAt(i) && s.charAt(i) <= 'z') {
                index= s.charAt(i)-'a';
                check[index]= 100;
            }
        }
        for(int i=0;i<check.length;i++){
            if(check[i] != 100) return  isNotPanagram;
        }
        return isPanagram;
    }

    public static void main(String[] args){
        String s="We promptly judged antique ivory buckles for the next prize";
        String out = pangram.pangrams(s);
    }
}
