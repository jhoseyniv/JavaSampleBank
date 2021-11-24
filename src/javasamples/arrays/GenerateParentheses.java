package javasamples.arrays;

import java.util.Stack;

public class GenerateParentheses {
    public static boolean isValid(String s) {
        s=s.replaceAll("-","");
        boolean valid=true;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            Character ch= s.charAt(i);
            if(ch.charValue()=='(' || ch.charValue()=='{' || ch.charValue()=='[')
                stack.push(ch);
            else{
                if(!stack.isEmpty()){
                    Character ch2= stack.pop();
                    if(ch ==')' && ch2!='(' ) return false;
                    if(ch =='}' && ch2!='{' ) return false;
                    if(ch ==']' && ch2!='[' ) return false;

                }else return false;
            }

        }

        if(!stack.isEmpty()) return false;
        return  valid;
    }
    public static void GeneratePermRecusive(int start,String s){
        if(s.length()==start) {
            return;
        }
        System.out.println(s.substring(0,start+1));
        GeneratePermRecusive(start+1,s);
    }

    public static void GenerateAllPermuation(String st){
        int[] mask= new int[st.length()];
        long num= (long)Math.pow(2,mask.length);
        System.out.println("number of Permuation is ="+ num);
       for(long i=0;i<num;i++) {
           String binary = Long.toBinaryString(i);
           String result = String.format("%" + st.length() + "s", binary).replace(' ', '0');
           StringBuilder permiuation = new StringBuilder(result);
           for (int j = 0; j < permiuation.length(); j++) {
              if (permiuation.charAt(j) == '0') {
                   permiuation.setCharAt(j, '-');
               } else if (result.charAt(j) == '1')
                   permiuation.setCharAt(j, st.charAt(j));
           }
         //  if(isValid(permiuation.toString()))
                System.out.println(permiuation  );
          // else      System.out.println(permiuation + " is  NOT Valid experssion" );

       }
    }
    public static void main(String[] args){
        String st="abcd";
       // GenerateAllPermuation(st);
        GeneratePermRecusive(0,st);
    }
}
