package com.mksense.algos1.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 *
 *
 * Example 1:
 *      Input: s1 = "ab", s2 = "eidbaooo"
 *      Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 *      Input: s1 = "ab", s2 = "eidboaoo"
 *      Output: false
 *
 *
 * Constraints:
 *      1 <= s1.length, s2.length <= 10^4
 *      s1 and s2 consist of lowercase English letters.
 */
public class PermutationInString {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        PermutationInString pis = new PermutationInString();
        System.out.println(pis.checkInclusion2(s1, s2));
    }

    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1map = new HashMap<>(s1.length());
        HashMap<Character, Integer> s2map = new HashMap<>(s1.length());

        fill(s1, s1map);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String substr = s2.substring(i, i + s1.length());
            fill(substr, s2map);

            if (match(s1map, s2map)) {
                return true;
            } else {
                s2map.clear();
            }
        }

        return false;
    }

    public boolean checkInclusion1(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1map = new int[26];
        for (int i = 0; i < s1.length(); i++)
            s1map[s1.charAt(i) - 'a']++;

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];

            for (int j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }

            if (match(s1map, s2map)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInclusion2(String s1, String s2) {
        int[] s1map = new int[26];
        int[] s2map = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (match(s1map, s2map)) {
                return true;
            }

            s2map[s2.charAt(i + s1.length()) - 'a']++;
            s2map[s2.charAt(i) - 'a']--;
        }

        return match(s1map, s2map);
    }

    private boolean match(int[] s1map, int[] s2map) {
        for (int p = 0; p < 26; p++) {
            if (s1map[p] != s2map[p])
                return false;
        }
        return true;
    }

    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }

    public void fill(String s, HashMap<Character, Integer> map) {
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i) , 0) + 1);
        }
    }

    public boolean match(Map<Character, Integer> s1map, Map<Character, Integer> s2map) {
        for (Map.Entry<Character, Integer> entry : s1map.entrySet()) {

            if (entry.getValue() - s2map.getOrDefault(entry.getKey(), -1) != 0) {
                return false;
            }
        }

        return true;
    }
}
