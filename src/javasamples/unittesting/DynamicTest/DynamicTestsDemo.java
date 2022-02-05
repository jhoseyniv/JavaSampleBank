package javasamples.unittesting.DynamicTest;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestsDemo {
    private final Calculator calculator = new Calculator();

//    @TestFactory
//    List<String> dynamicTestsWithInvalidReturnType() {
//        return Arrays.asList("Hello");
//    }
    public boolean isPalindrome(String p){
        boolean isPal=true;
        for(int i=0; i<p.length() /2 ; i++)
            if(p.charAt(i) != p.charAt(p.length()-i-1)) return  false;

     return  isPal;
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return Arrays.asList(
                dynamicTest("1nd dynamic test", () -> assertEquals(4, calculator.multiply(2, 2))),
                dynamicTest("2th dynamic test", () -> assertTrue(isPalindrome("dad"))),
                dynamicTest("3nd dynamic test", () -> assertEquals(10, calculator.multiply(2, 5)))
        );
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestIterator(){
        return Arrays.asList(
                dynamicTest("4th dynamic test", () -> assertTrue(isPalindrome("dd"))),
                dynamicTest("5th dynamic test", () -> assertTrue(isPalindrome("c"))),
                dynamicTest("6th dynamic test", () -> assertTrue(isPalindrome("bmmadammb"))),
                dynamicTest("7th dynamic test", () -> assertTrue(isPalindrome("fbmmadammbf"))),
                dynamicTest("8th dynamic test", () -> assertTrue(isPalindrome("fbmmadammb")))
        ).iterator();
    }

    @TestFactory
    DynamicTest[]  dynamicTestsForArray(){
        return new DynamicTest[]{
                dynamicTest("9th dynamic test",()->assertTrue(isPalindrome("abbba")))
        };
    }

    @TestFactory
    DynamicNode dynamicNodeSingleTest() {
        return dynamicTest(" 10th 'popo' is not a palindrome", () -> assertTrue(isPalindrome("popo")));
    }

}
