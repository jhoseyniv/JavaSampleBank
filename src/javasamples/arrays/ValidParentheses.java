package javasamples.arrays;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
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
    public static void main(String[] args){
        String input = "[())]";
        boolean res=isValid(input);
        System.out.println(res);

    }
}
