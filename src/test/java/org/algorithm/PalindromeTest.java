package org.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void detectsPalindromeIgnoringSpacesAndCase() throws Exception {
        assertTrue(invokeIsPalindrome("Able was I ere I saw Elba"));
    }

    @Test
    void detectsNonPalindrome() throws Exception {
        assertFalse(invokeIsPalindrome("algorithm"));
    }

    @Test
    void detectsEmptyStringAsPalindrome() {
        assertTrue(Palindrome.isPalindrome(""));
    }

   @Test
    void detectsSingleCharacterAsPalindrome() throws Exception {
        assertTrue(invokeIsPalindrome("x"));
    }

    private boolean invokeIsPalindrome(String value) throws Exception {
        Method method = Palindrome.class.getDeclaredMethod("isPalindrome", String.class);
        method.setAccessible(true);
        return (boolean) method.invoke(null, value);
    }
}
