package StringTools;

import java.util.ArrayList;

public class ReverseString {

    public static String getNextToken(int fromIndex, String input){
        ArrayList<String> output = new ArrayList<String>();
        String out="";
        boolean startToken=false;
        boolean tokenComplete=false;
        String token="";

        while ( fromIndex< input.length() ) {
            char ch = input.charAt(fromIndex);
            if(ch!=' ')  {
                startToken=true;
            }
                while (startToken){
                    token = token + input.charAt(fromIndex);
                    if(input.charAt(fromIndex) ==' ')  {
                        startToken=false;
                        tokenComplete=true;

                    }
                    fromIndex++;
                    if(tokenComplete) {
                        output.add(token);
                         token="";
                    }
                }

            tokenComplete=false;
        }


        return out;
    }

    public static  void main(String args[]){
        //this piece of code reverse a given string for example
        //input string =" this is a test ";  output = test a is this"
        String input="This is test string for reverse , i love programming  ";
        String output="";
        int i=0;
        output=getNextToken(0,input);
        System.out.println("Reversi");
    }
}
