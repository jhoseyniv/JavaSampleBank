package javasamples.unittesting.calculator;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

public class MyCalculator   {
    public static long pow(int p, int n ) throws Exception {
        if(p<0 || n<0) throw  new java.lang.Exception("p or n should not be negative");
        if(p==0 && n==0 ) throw  new java.lang.Exception("p and n should not be zero");
        if(n==1) return p;
        else return pow(p,n-1)*p;
    }
    public static void main(String args[]) throws Exception {
        long m=MyCalculator.pow(0,0);
    }
    @TestFactory
    Collection<DynamicTest> dynamicTestCollection(){
        return Arrays.asList(
                DynamicTest.dynamicTest("1th test",() -> assertEquals(4, pow(2, 2))),
                DynamicTest.dynamicTest("1th test",() -> assertEquals(32, pow(2, 5))),
                DynamicTest.dynamicTest("1th test",() -> assertEquals("java.lang.Exception: p and n should not be zero", pow(0, 0)))
        );

    }


}
