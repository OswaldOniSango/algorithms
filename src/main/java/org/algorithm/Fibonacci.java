package org.algorithm;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fibonacci {
    
    public static BigDecimal fibonacci(int limitNumber) {
        if (limitNumber < 0) {
            throw new IllegalArgumentException("Input must be a non-negative.");
        }
        if (limitNumber == 0) {
            return BigDecimal.ZERO;
        }
        if (limitNumber == 1) {
            return BigDecimal.ONE;
        }

        BigDecimal fistDigit = BigDecimal.ZERO;
        BigDecimal secondDigit = BigDecimal.ONE;
        BigDecimal fibonacci = BigDecimal.ZERO;

        for (int i = 2; i <= limitNumber; i++) {
            fibonacci = fistDigit.add(secondDigit);
            fistDigit = secondDigit;
            secondDigit = fibonacci;
        }

        return fibonacci.setScale(0, RoundingMode.DOWN);
    }

}
