package javasamples.designpattern.StrategyPattern;

import java.math.BigInteger;

public interface Strategy {
    public BigInteger calculation(BigInteger a, BigInteger b);
}
