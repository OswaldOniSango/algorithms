package org.algorithm;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingTest {
    @Test
    void testExampleCases() {

        assert LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb") == 3;
        assert LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb") == 1;
        assert LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew") == 3;
        assert LongestSubstringWithoutRepeating.lengthOfLongestSubstring("") == 0;
        assert LongestSubstringWithoutRepeating.lengthOfLongestSubstring("au") == 2;
        assert LongestSubstringWithoutRepeating.lengthOfLongestSubstring("dvdf") == 3;
    }
}
