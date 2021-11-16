package javasamples.JavaRegex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Regex_Matcher {

    public  static boolean ipv4_Checker(String input){
        String IP_REGEX="^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\."+
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\."+
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

        Pattern ipPattern=Pattern.compile(IP_REGEX);
        Matcher matcher=ipPattern.matcher(input);
        boolean isMatch=matcher.matches();

        if(isMatch)
            System.out.println(input + " has a VALID ip format...");
        else
            System.out.println(input+" has NOT VALID ip format...");

        return isMatch;
    }

    public static boolean email_Checker(String email){
        String EMAIL_REGEX="^[^&,%$#!+':;|{}]+$";

        Pattern emailPattern=Pattern.compile(EMAIL_REGEX);
        Matcher emailMatcher= emailPattern.matcher(email);
        boolean isMatch = emailMatcher.matches();
        if(isMatch)
            System.out.println(email + " HAS a VALID email format");
        else
            System.out.println(email +" has NOT VALID  email format");
        return  isMatch;
    }

    @Test
    public static void testUsingSimpleRegex() {
       String  emailAddress = "(username@domain.com";
        assertTrue(email_Checker(emailAddress));
    }

    public static void main(String args[]){
        String input_IP="255.22.0.252";
        String input_EMIAL="hhdfgdfg;";
        ipv4_Checker(input_IP);
        email_Checker(input_EMIAL);
       // testUsingSimpleRegex();

    }
}
