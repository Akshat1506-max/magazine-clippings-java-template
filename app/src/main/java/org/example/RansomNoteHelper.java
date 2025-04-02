package org.example;

import java.util.HashMap;

public class RansomNoteHelper {
    public static boolean canCreateNote(String note, String[] articles) {
        // Combine all articles into one string
        StringBuilder combined = new StringBuilder();
        for (String article : articles) {
            combined.append(article);
        }

        // Build frequency map from the combined article text
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (char c : combined.toString().toLowerCase().toCharArray()) {
            if (c != ' ') { // Ignore spaces
                magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
            }
        }

        // Check each letter in the note
        for (char c : note.toLowerCase().toCharArray()) {
            if (c == ' ') continue; // Ignore spaces
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }
}