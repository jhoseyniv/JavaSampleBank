package javasamples.Premuation;

public class SeparateTheNumbers {

    public static int getExpectedValue(int pointer,int digits,String input){
        String subString = input.substring(pointer,pointer+digits);
        int subStringIntValue=Integer.parseInt(subString);
        return subStringIntValue;
    }
    public static int getCurrentValue(int pointer,int digits,String input){
        String subString = input.substring(pointer,pointer+digits);
        int subStringIntValue=Integer.parseInt(subString);
        return subStringIntValue;
    }
    public static boolean checkNextValue(int nextValue, int pointer,int digits,String input){
        String nextValueString = String .valueOf(nextValue);
        String subString = input.substring(pointer,pointer + nextValueString.length());
        int subStringIntValue=Integer.parseInt(subString);

        if(nextValue == subStringIntValue)       return true;
        else  return false;
    }
    public static void main(String args[]){
        String input ="99100101102103";
        int pointer=0;
        int digits =1;

        while(pointer <= input.length()){
            int currentValue = getCurrentValue(pointer,digits,input);
            int nextValue=currentValue + 1;
            //pointer = pointer + digits;
            boolean isNextValueValid = checkNextValue(nextValue, pointer + digits,digits,input);
            if(isNextValueValid ==true ) {
                String nextValueString = String .valueOf(nextValue);
                digits = nextValueString.length();
                pointer = pointer + digits;
            }else if(isNextValueValid==false){
               pointer = pointer - digits;
                if(pointer<0) pointer=0;
               digits++;
            }
        }
    }
}
