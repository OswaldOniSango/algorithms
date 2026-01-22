package org.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Angram {

    private static boolean isAngram(String word1, String word2) {
        String cleanWord1 = word1.replaceAll(" ", "").toLowerCase();
        String cleanWord2 = word2.replaceAll(" ", "").toLowerCase();

        List<String> list1 = createListWithWord(cleanWord1);
        List<String> list2 = createListWithWord(cleanWord2);
        if (list1.size() != list2.size()) {
            return false;
        }
        for (String letter : list1) {
            if(!list2.contains(letter)){
                return false;
            }
        }

    return true;
    }

    private static List<String> createListWithWord(String cleanWord1) {
        List<String> word1List = new ArrayList<>();
        for(int i = 0; i < cleanWord1.length(); i++ ) {
            word1List.add(String.valueOf(cleanWord1.charAt(i)));
        }
        return word1List;
    }
}
