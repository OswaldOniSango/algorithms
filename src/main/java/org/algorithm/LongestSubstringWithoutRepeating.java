package org.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Sliding Window:
 * Longest substring without repeating characters.
 *
 * Time: O(n)
 * Space: O(min(n, alphabet))
 */
public final class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            throw new IllegalArgumentException("input string cannot be null");
        }

        Map<Character, Integer> lastSeenIndex = new HashMap<>();
        int best = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            Integer prevIndex = lastSeenIndex.get(c);
            if (prevIndex != null && prevIndex >= left) {
                // Move left just past the previous occurrence
                left = prevIndex + 1;
            }

            lastSeenIndex.put(c, right);
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
