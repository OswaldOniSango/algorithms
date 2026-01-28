package org.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingTest {

    @Test
    void nullInputThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> LongestSubstringWithoutRepeating.lengthOfLongestSubstring(null));
    }

    @Test
    void emptyString() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(""));
    }

    @Test
    void allSameChar() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbbb"));
    }

    @Test
    void classicCases() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void includesSpacesAndSymbols() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("a b a"));
        assertEquals(5, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("ab!@#ab"));
    }

    @Test
    void unicodeStillWorksPerCharUnit() {
        assertEquals(4, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("áéíóá"));
    }
}
