package org.example.anagram;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s1 = "army";
        String s2 = "Mary";
        System.out.println(anagram.isAnagram(s1, s2));
    }

    public boolean isAnagram(String s1, String s2){
        // Check if the length of the two strings are equal
        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
            return false;
        }
        else {
            // Convert the strings to lower case and sort them
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            // Convert the sorted arrays to strings and compare them
            String s1Sorted = new String(s1Array);
            String s2Sorted = new String(s2Array);
            if (s1Sorted.equals(s2Sorted)) {
                System.out.println("Anagram");
                return true;
            } else {
                System.out.println("Not anagram");
                return false;

            }
        }
    }
}