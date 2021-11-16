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

    public static  String  RemoveduplicateWordByChecker(String input){
        String duplicate_REGEX="\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern duplicateWord_pattern= Pattern.compile(duplicate_REGEX,Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);
        Matcher m= duplicateWord_pattern.matcher(input);
        while (m.find()) {
            input
                    = input.replaceAll(
                    m.group(),
                    m.group(1));
        }
        return input;
}


    @Test
    public static void testUsingSimpleRegex() {
       String  emailAddress = "(username@domain.com";
        assertTrue(email_Checker(emailAddress));
    }

    public static void main(String args[]){
        String input_IP="255.22.0.252";
        String input_EMIAL="hhdfgdfg;";
        String input_duplicateWord="Goodbye bye bye world world world";
        String input_duplicateWord2=" Reya is is the the best player in eye eye game";

        ipv4_Checker(input_IP);
        email_Checker(input_EMIAL);
        testUsingSimpleRegex();
        System.out.println("Before Remove duplicate words = " + input_duplicateWord);
        System.out.println("Before Remove duplicate words = " + input_duplicateWord2);
        String output= RemoveduplicateWordByChecker(input_duplicateWord);
        String output2= RemoveduplicateWordByChecker(input_duplicateWord2);
        System.out.println("After Remove duplicate words= " + output);
        System.out.println("After Remove duplicate words= " + output2);
    }
}
