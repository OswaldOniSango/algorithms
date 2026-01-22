package org.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class OutlierDetectorTest {

    @Test
    void returnsOutliersBeyondBounds() {
        ArrayList<BigDecimal> data = new ArrayList<>(Arrays.asList(
                new BigDecimal("1"),
                new BigDecimal("2"),
                new BigDecimal("2"),
                new BigDecimal("2"),
                new BigDecimal("3"),
                new BigDecimal("100")
        ));

        BigDecimal[] outliers = OutlierDetector.detectOutliers(data);

        assertArrayEquals(new BigDecimal[] { new BigDecimal("100") }, outliers);
    }

    @Test
    void returnsEmptyArrayWhenNoOutliers() {
        ArrayList<BigDecimal> data = new ArrayList<>(Arrays.asList(
                new BigDecimal("1"),
                new BigDecimal("2"),
                new BigDecimal("3"),
                new BigDecimal("4")
        ));

        BigDecimal[] outliers = OutlierDetector.detectOutliers(data);

        assertArrayEquals(new BigDecimal[0], outliers);
    }

    @Test
    void handlesEmptyInput() {
        ArrayList<BigDecimal> data = new ArrayList<>();

        BigDecimal[] outliers = OutlierDetector.detectOutliers(data);

        assertArrayEquals(new BigDecimal[0], outliers);
    }
}
