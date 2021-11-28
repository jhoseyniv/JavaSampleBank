package javasamples.numbertheory.testunit;


import javasamples.numbertheory.testunit.BigNumbersTestUnit;
import javasamples.numbertheory.testunit.RecursiveDigitSumTestUnit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RecursiveDigitSumTestUnit.class,
        BigNumbersTestUnit.class
})
public  class AllUnitTest {


}
