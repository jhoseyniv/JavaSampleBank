package javasamples.unittesting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {
    MyMath myMath= new MyMath();

    @Test
    public void sum_5Numbers(){
        System.out.println("Test case 1");
        assertEquals(10, myMath.sumOfNumber( new int[] {1,2,3,4}));
    }
    public void sum_1Number(){
        System.out.println("Test case 2");
        assertEquals(4,myMath.sumOfNumber(new int[]{4}));
    }
}
