package org.algorithm;

import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static Integer binarySearch(int valueToFind, List<Integer> integerList) {
        // Sort the list before searching
        Collections.sort(integerList);
        int startIndex = 0;
        int endIndex = integerList.size() - 1;

        while (startIndex <= endIndex) {
            int middleIndex = getMiddleIndex(startIndex, endIndex);

            if (valueToFind == integerList.get(middleIndex)) {
                // Found the value
                return integerList.get(middleIndex);
            } else if (valueToFind > integerList.get(middleIndex)) {
                // Search in the right half
                startIndex = middleIndex + 1;
            } else {
                // Search in the left half
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    private static int getMiddleIndex(int startIndex, int endIndex) {
        return (startIndex + endIndex) / 2;
    }
}
