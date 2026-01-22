package org.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PangramTest {

    @Test
    void identifiesPangram() {
        assertTrue(Pangram.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    void rejectsNonPangram() {
        assertFalse(Pangram.isPangram("Missing some letters"));
    }

    @Test
    void identifiesPangramWithMixedCaseAndPunctuation() {
        assertTrue(Pangram.isPangram("Pack my box with five dozen liquor jugs!"));
    }

    @Test
    void rejectsEmptyString() {
        assertFalse(Pangram.isPangram(""));
    }
}
