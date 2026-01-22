package org.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void findsValueAfterSorting() {
        List<Integer> values = new ArrayList<>(Arrays.asList(5, 1, 4));

        Integer valueFound = BinarySearch.binarySearch(4, values);

        assertEquals(4, valueFound);
    }

    @Test
    void returnsMinusOneWhenMissing() {
        List<Integer> values = new ArrayList<>(Arrays.asList(5, 1, 4));

        Integer valueFound = BinarySearch.binarySearch(10, values);

        assertEquals(-1, valueFound);
    }

    @Test
    void findsValueInSingleElementList() {
        List<Integer> values = Collections.singletonList(7);

        Integer valueFound = BinarySearch.binarySearch(7, values);

        assertEquals(7, valueFound);
    }

    @Test
    void returnsMinusOneInEmptyList() {
        List<Integer> values = new ArrayList<>();

        Integer valueFound = BinarySearch.binarySearch(3, values);

        assertEquals(-1, valueFound);
    }

    @Test
    void calculatesMiddleIndex() throws Exception {
        Method method = BinarySearch.class.getDeclaredMethod("getMiddleIndex", int.class, int.class);
        method.setAccessible(true);

        int middleIndex = (int) method.invoke(null, 0, 3);

        assertEquals(1, middleIndex);
    }

}
