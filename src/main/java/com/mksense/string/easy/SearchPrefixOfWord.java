package com.mksense.string.easy;

/**
 * Given a sentence that consists of some words separated by a single space, and a searchWord,
 * check if searchWord is a prefix of any word in sentence.
 *
 * Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word.
 * If searchWord is a prefix of more than one word, return the index of the first word (minimum index).
 * If there is no such word return -1.
 *
 * A prefix of a string s is any leading contiguous substring of s.
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "i love eating burger", searchWord = "burg"
 * Output: 4
 * Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
 * Example 2:
 *
 * Input: sentence = "this problem is an easy problem", searchWord = "pro"
 * Output: 2
 * Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence,
 * but we return 2 as it's the minimal index.
 * Example 3:
 *
 * Input: sentence = "i am tired", searchWord = "you"
 * Output: -1
 * Explanation: "you" is not a prefix of any word in the sentence.
 * Example 4:
 *
 * Input: sentence = "i use triple pillow", searchWord = "pill"
 * Output: 4
 * Example 5:
 *
 * Input: sentence = "hello from the other side", searchWord = "they"
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= sentence.length <= 100
 * 1 <= searchWord.length <= 10
 * sentence consists of lowercase English letters and spaces.
 * searchWord consists of lowercase English letters.
 *
 * @author Lue
 * @date 2021-10-23
 */
public class SearchPrefixOfWord {

    public int isPrefixOfWord(final String sentence, final String searchWord) {
        // We are not care of NPE problem
        if (sentence.length() > 100 || sentence.length() < 1) {
            throw new RuntimeException();
        }
        if (searchWord.length() > 10 || searchWord.length() < 1) {
            throw new RuntimeException();
        }
        /*
        Here I use java.lang.String#split() to String array for comparing,
        we could have another approach achieve it. Reading the sentence alphabet to char[]
        compare with searchWord when reach a single space, so we can split time and String[]
        space.
         */
        String[] strings = sentence.trim().split(" ");
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (s.length() < searchWord.length()) {
                continue;
            }
            if (s.startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final String sentence = "i use triple pillow";
        final String searchWord = "pill";
        final int expected = 4;
        SearchPrefixOfWord solution = new SearchPrefixOfWord();
        System.out.println(expected == solution.isPrefixOfWord(sentence, searchWord));
    }
}
