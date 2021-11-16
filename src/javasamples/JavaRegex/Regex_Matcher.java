package javasamples.JavaRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Matcher {

    public  static boolean IP_Checker(String input){
        String IP_REGEX="^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\."+
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\."+
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

        Pattern ipPattern=Pattern.compile(IP_REGEX);
        Matcher matcher=ipPattern.matcher(input);
        boolean isMatch=matcher.matches();

        if(isMatch)
            System.out.println(input + " has a valid ip format...");
        else
            System.out.println(input+" has not a valid ip format...");

        return isMatch;
    }


    public static void main(String args[]){
        String input="255.22.0.256";
        IP_Checker(input);

    }
}
