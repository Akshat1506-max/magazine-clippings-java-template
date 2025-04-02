package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testSimpleTrueCase() {
        assertTrue(RansomNoteHelper.canCreateNote("a", new String[]{"a"}));
    }

    @Test
    void testSimpleFalseCase() {
        assertFalse(RansomNoteHelper.canCreateNote("a", new String[]{"b"}));
    }

    @Test
    void testComplexTrueCase() {
        String note = "The bird is red!";
        String[] articles = {
            "I write a lot.",
            "To and fro.",
            "Here be deadly dragons!"
        };
        assertTrue(RansomNoteHelper.canCreateNote(note, articles));
    }

    @Test
    void testComplexFalseCase() {
        String note = "The bird is red!";
        String[] articles = {
            "I write a lot.",
            "To and fro.",
            "Here be deadly dragons"
        };
        assertFalse(RansomNoteHelper.canCreateNote(note, articles));
    }
}