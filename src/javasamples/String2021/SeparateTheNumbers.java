package javasamples.String2021;

public class SeparateTheNumbers {
    public static void main(String args[]){
        String input="99100101102103104105";
        String input2="99910001001";
        String input3="999100010001";

//        String out1= getStateOfString(input);
//        System.out.println(out1);
//
//
//        String out2= getStateOfString(input2);
//        System.out.println(out2);

        String out3= getStateOfString(input3);
        System.out.println(out3);

    }

    public static String getStateOfString(String input){
        int position=0;
        int digit=1;
        boolean state=false;
        boolean isStringBeautiful=false;
        while(position < input.length()  ){
            String currentToken=getCurrentToken(position,digit,input);
            String expectedToken = getExpectedToken(currentToken);
            if(!isLastToken(currentToken,position,input) && expectedToken.length() + position > input.length()) {
                String nextToken = getNextToken(currentToken.length() + position, expectedToken.length(), input);
                state = compareTokenes(expectedToken, nextToken);
                digit = expectedToken.length();
            }

            if(!state && position >input.length()) isStringBeautiful=false;
            else  if( !state && position < input.length()){
                position =0;
                digit++;
            }
            if(state && position >input.length()) isStringBeautiful=true;
            if(state && position < input.length()) {
                position = currentToken.length() + position  ;
                isStringBeautiful=true;
            }


        }
        if(isStringBeautiful) return "YES";
        else  return "NO";

    }


    private static boolean isLastToken(String currentToken, int position, String input) {
        if(currentToken.length() + position == input.length()) return true;
        return false;
    }

    private static String getNextToken(int position, int expectedToken,String input) {
       // if(expectedToken + position >= input.length()) return "LAST";
        return  input.substring(position,expectedToken + position);
    }

    private static boolean compareTokenes(String expectedToken, String nextToken) {
        if(expectedToken.equalsIgnoreCase(nextToken)) return true;
        return false;
    }

    private static String getExpectedToken(String currentToken) {
        int next= Integer.parseInt(currentToken) + 1;
        return String.valueOf(next);

    }

    private static String getCurrentToken(int position, int digit, String input) {
        return input.substring(position,position+digit);
    }
}
