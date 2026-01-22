package org.algorithm;

import java.util.List;

public class BubbleSort {

    public static void orderListWithMethodBubbleSort(List<Integer> integerList) {
        int n = integerList.size();
        int temp;
        boolean swapped;

        // Iterate through the list
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Iterate through the list - `i` elements are already in place after previous iterations
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if the current element is greater than the next one
                if (integerList.get(j) > integerList.get(j + 1)) {
                    // Perform the swap
                    temp = integerList.get(j);
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, temp);
                    swapped = true; // Indicate that at least one swap occurred in this pass
                }
            }

            // If no swaps were made in this pass, the list is already sorted, so we can break early
            if (!swapped) {
                break;
            }
        }
    }
}
