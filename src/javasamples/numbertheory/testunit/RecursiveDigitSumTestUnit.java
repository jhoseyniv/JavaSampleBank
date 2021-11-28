package javasamples.numbertheory.testunit;

import javasamples.numbertheory.RecursiveDigitSum;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RecursiveDigitSumTestUnit {

    @Test
    public void SuperDigitTest(){
        assertEquals(RecursiveDigitSum.superDigit("9875987598759875",16),8);

    }
}
