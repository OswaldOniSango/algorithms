package org.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(13);
        integerList.add(14);
        integerList.add(6);
        integerList.add(20);
        integerList.add(7);
        integerList.add(14);
        integerList.add(19);
        integerList.add(29);
        integerList.add(9);
        integerList.add(5);

        int valueToFind = 9;

        int index = binarySearch(valueToFind, integerList);

        if (index != -1) {
            System.out.println("Value " + valueToFind + " found at index " + index);
        } else {
            System.out.println("Value " + valueToFind + " not found in the list.");
        }
    }

    private static Integer binarySearch(int valueToFind, List<Integer> integerList) {
        // Sort the list before searching
        Collections.sort(integerList);
        int startIndex = 0;
        int endIndex = integerList.size() - 1;

        while (startIndex <= endIndex) {
            int middleIndex = getMiddleIndex(startIndex, endIndex);

            if (valueToFind == integerList.get(middleIndex)) {
                // Found the value, return its index
                return middleIndex;
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
