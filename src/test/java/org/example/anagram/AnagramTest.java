package org.example.anagram;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void isAnagram_ShouldReturnTrue() {
        String s1 = "abcd";
        String s2 = "dcba";
        assertTrue(anagram.isAnagram(s1, s2));
    }

    @Test
    public void isAnagram_ShouldReturnFalse() {
        String s1 = "abcd";
        String s2 = "ccba";
        assertFalse(anagram.isAnagram(s1, s2));
    }
}