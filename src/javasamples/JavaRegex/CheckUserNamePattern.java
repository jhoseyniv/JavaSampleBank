package javasamples.JavaRegex;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class CheckUserNamePattern {

    public static final String USERNAME_PATTERN =  "^[a-zA-Z0-9]([_](?![_])|[a-zA-Z0-9]){6,28}[a-zA-Z0-9]$";

    public static boolean checkUserNamePattern(String name){
        final String USERNAME_PATTERN2 =  "^[A-Za-z]([._-](?![._-])|[a-zA-Z0-9]){6,29}[a-zA-Z0-9]$";
        Pattern p = Pattern.compile(USERNAME_PATTERN2);
        Matcher m= p.matcher(name);
        return m.matches();

    }

    public static void main(String args[]){
        String str1 = "Geeksforgeeks";
    }

 @TestFactory
    Collection<DynamicTest> dynamicTestCollection(){
        return Arrays.asList(
                dynamicTest("first test case---",()->assertTrue(checkUserNamePattern("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab")) ),
                dynamicTest("second test----",()->assertTrue(checkUserNamePattern("1Geeksforge-eks"))),
                dynamicTest("second test----",()->assertTrue(checkUserNamePattern("Geeksforge.eks")))
        );
    }


}
