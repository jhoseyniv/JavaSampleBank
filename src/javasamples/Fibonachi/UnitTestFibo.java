package javasamples.Fibonachi;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestFibo {



//    @Test
//    public  void isNumberOnFiboSeri(){
//        assertEquals(true,FiboonachiValidator.isFibonacci(1));
//        assertEquals(true,FiboonachiValidator.isFibonacci(2));
//        assertEquals(true,FiboonachiValidator.isFibonacci(13));
//        assertEquals(true,FiboonachiValidator.isFibonacci(21));
//    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2,13,21 })
    void palindromes(int fib) {
        assertEquals(true,FiboonachiValidator.isFibonacci((fib) ));
    }
}
