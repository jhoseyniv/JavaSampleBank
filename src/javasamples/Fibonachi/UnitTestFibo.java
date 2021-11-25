package javasamples.Fibonachi;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestFibo {

    @Test
    public  void isNumberOnFiboSeri(){
        assertEquals(true,FiboonachiValidator.isFibonacci(1));
        assertEquals(true,FiboonachiValidator.isFibonacci(2));
        assertEquals(true,FiboonachiValidator.isFibonacci(13));
        assertEquals(true,FiboonachiValidator.isFibonacci(21));
    }

}
