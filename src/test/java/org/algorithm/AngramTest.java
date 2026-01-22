package org.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AngramTest {

    @Test
    void detectsAnagramIgnoringSpacesAndCase() {
        assertTrue(Angram.isAngram("Listen", "Silent"));
    }

    @Test
    void rejectsNonAnagram() {
        assertFalse(Angram.isAngram("hello", "world"));
    }

    @Test
    void detectsAnagramWithSpaces() {
        assertTrue(Angram.isAngram("Astronomer", "Moon starer"));
    }

    @Test
    void rejectsAnagramWithDifferentLengths() {
        assertFalse(Angram.isAngram("hello", "helloo"));
    }

    @Test
    void testAnagramWithSpecialCharacters() {
        assertFalse(Angram.isAngram("hello!", "oellh"));
    }

    @Test
    void testAnagramWithEmptyStrings() {
        assertTrue(Angram.isAngram("", ""));
    }


}
