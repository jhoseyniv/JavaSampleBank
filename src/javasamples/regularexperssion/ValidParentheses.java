package javasamples.regularexperssion;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        boolean valid=false;
        Stack<Character> experssion=new Stack<Character>();
        for( int i=0 ;i<s.length();i++){
            Character character= s.charAt(i);

            if( character.charValue()=='(' ||  character.charValue()=='['||  character.charValue()=='{') {
                experssion.push(character);
            } else if (character==')'){
                if(experssion.isEmpty() ) return false;
                else {
                    Character ch= experssion.peek();
                    if(ch=='(') experssion.pop();
                    else return false;
                }
            } else if(character==']'){
                if(experssion.isEmpty() ) return false;
                else {
                    Character ch= experssion.peek();
                    if(ch=='[') experssion.pop();
                    else return false;
                }
            }
        else if(character=='}'){
            if(experssion.isEmpty() ) return false;
            else {
                Character ch= experssion.peek();
                if(ch=='{') experssion.pop();
                else return false;
            }
        }
        }
        if(experssion.isEmpty() ) valid=true;
        return valid;
    }
    public static boolean isValid3(String s) {
        boolean valid=false;
        Stack<Character> experssion=new Stack<Character>();
        for( int i=0 ;i<s.length();i++){
            Character character= s.charAt(i);

            if( character.charValue()=='(' ||  character.charValue()=='['||  character.charValue()=='{') {
                experssion.push(character);
            } else if(!experssion.isEmpty()) {
                 if (character == ')' && experssion.pop() != '(' || experssion.isEmpty()) return false;
                else if (character == '}' && experssion.peek() != '{' || experssion.isEmpty()) return false;
                else if (character == ']' && experssion.peek() != '[' || experssion.isEmpty()) return false;
            }
        }
        if(experssion.isEmpty() ) valid=true;
        return valid;
    }
    public static boolean isValid2(String s) {
        Stack<Character> parents = new Stack<Character>();
        for(char c : s.toCharArray())
            if(c == '(' || c == '[' || c == '{') parents.push(c);
            else if(parents.empty() || Math.abs(c - parents.pop()) > 2) return false;
        return parents.empty();
    }
    public static void main(String[] args){
        String st= ")";
        boolean result= isValid3(st);
        System.out.println(result);
    }

}
