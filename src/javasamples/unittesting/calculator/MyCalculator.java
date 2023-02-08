package javasamples.unittesting.calculator;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

public class MyCalculator   {
    public boolean isPalindrome(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
    public static long pow(int p, int n ) throws Exception {
        if(p<0 || n<0) throw  new java.lang.Exception("p or n should not be negative");
        if(p==0 && n==0 ) throw  new java.lang.Exception("p and n should not be zero");
        if(n==1) return p;
        else return pow(p,n-1)*p;
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestCollection(){
        return Arrays.asList(
                DynamicTest.dynamicTest("1th test",() -> assertEquals(4, pow(2, 2))),
                DynamicTest.dynamicTest("1th test",() -> assertEquals(32, pow(2, 5))),
                //DynamicTest.dynamicTest("1th test",() -> assertEquals("java.lang.Exception: p and n should not be zero", pow(0, 0))
                DynamicTest.dynamicTest("1th test",() -> assertEquals(64, pow(2, 6)))

        );

    }
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

}
