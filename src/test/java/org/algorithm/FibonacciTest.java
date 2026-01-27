package org.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void returnsCorrectSequenceValues() {
        List<BigDecimal> expectedSequence = List.of(
            BigDecimal.ZERO,
            BigDecimal.ONE,
            BigDecimal.ONE,
            new BigDecimal("2"),
            new BigDecimal("3"),
            new BigDecimal("5"),
            new BigDecimal("8"),
            new BigDecimal("13"),
            new BigDecimal("21"),
            new BigDecimal("34"),
            new BigDecimal("55"),
            new BigDecimal("89")
        );

        assertEquals(expectedSequence, Fibonacci.fibonacci(10));
    }

    @Test
    void handlesZeroInput() {
        List<BigDecimal> expectedSequence = Collections.singletonList(BigDecimal.ZERO);
        assertEquals(expectedSequence, Fibonacci.fibonacci(0));
    }

    @Test
    void handlesOneInput() {
        List<BigDecimal> expectedSequence = Collections.singletonList(BigDecimal.ONE);
        assertEquals(expectedSequence, Fibonacci.fibonacci(1));
    }

    @Test
    void rejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}
