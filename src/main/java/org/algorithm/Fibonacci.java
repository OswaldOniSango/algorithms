package org.algorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fibonacci {
    
    public static List<BigDecimal> fibonacci(int limitNumber) {
        if (limitNumber < 0) {
            throw new IllegalArgumentException("Input must be a non-negative.");
        }
        if (limitNumber == 0) {
            return Collections.singletonList(BigDecimal.ZERO);
        }
        if (limitNumber == 1) {
            return Collections.singletonList(BigDecimal.ONE);
        }

        List<BigDecimal> fibonacciSequence = new ArrayList<>();
        BigDecimal firstDigit = BigDecimal.ZERO;
        BigDecimal secondDigit = BigDecimal.ONE;

        fibonacciSequence.add(firstDigit);
        fibonacciSequence.add(secondDigit);

        while (fibonacciSequence.size() < limitNumber + 2) {
            BigDecimal next = firstDigit.add(secondDigit);
            fibonacciSequence.add(next);
            firstDigit = secondDigit;
            secondDigit = next;
        }

        return fibonacciSequence;
    }

}
