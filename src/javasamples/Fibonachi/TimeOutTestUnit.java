package javasamples.Fibonachi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeOutTestUnit {

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds100Milliseconds() {
        // fails if execution time exceeds 100 milliseconds
        FibonacciNumbers.fiboRecurseive(40);
    }
    @Test
    @Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds100Milliseconds2() {
        // fails if execution time exceeds 100 milliseconds
        FibonacciNumbers.fiboDP(400);
    }
}
