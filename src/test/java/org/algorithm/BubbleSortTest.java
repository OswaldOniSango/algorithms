package org.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void sortsListInPlace() {
        List<Integer> values = new ArrayList<>(Arrays.asList(3, 1, 2));

        BubbleSort.orderListWithMethodBubbleSort(values);

        assertEquals(Arrays.asList(1, 2, 3), values);
    }

    @Test
    void handlesAlreadySortedWithDuplicates() {
        List<Integer> values = new ArrayList<>(Arrays.asList(1, 1, 2, 3));

        BubbleSort.orderListWithMethodBubbleSort(values);

        assertEquals(Arrays.asList(1, 1, 2, 3), values);
    }

    @Test
    void handlesEmptyList() {
        List<Integer> values = new ArrayList<>();

        BubbleSort.orderListWithMethodBubbleSort(values);

        assertEquals(new ArrayList<>(), values);
    }

    @Test
    void handlesSingleElementList() {
        List<Integer> values = Collections.singletonList(42);

        BubbleSort.orderListWithMethodBubbleSort(values);

        assertEquals(Collections.singletonList(42), values);
    }
}
