package com.mksense.algos1.day4;

import java.util.Arrays;

/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 *
 * <p>
 * Example 1:
 *      Input: s = "Let's take LeetCode contest"
 *      Output: "s'teL ekat edoCteeL tsetnoc"
 *
 * <p>
 * Example 2:
 *      Input: s = "God Ding"
 *      Output: "doG gniD"
 *
 * <p>
 * Constraints:
 *      1 <= s.length <= 5 * 10^4
 *      s contains printable ASCII characters.
 *      s does not contain any leading or trailing spaces.
 *      There is at least one word in s.
 *      All the words in s are separated by a single space.
 */
public class ReverseWordsInAStringIII {

    public static void main(String[] args) {
        String s = "Let's go to West Lake";
        ReverseWordsInAStringIII rwisiii = new ReverseWordsInAStringIII();
        System.out.println(rwisiii.reverseWords(s));
    }

    public String reverseWords(String s) {
        String whitespace = " ";
        String[] strs = s.split(whitespace);
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(whitespace).append(reverse(str));
        }

        return sb.substring(1);
    }

    public String reverse(String s) {
        char[] chs = s.toCharArray();
        int start = 0;
        int end = chs.length - 1;

        while (start < end) {
            char t = chs[start];
            chs[start] = chs[end];
            chs[end] = t;
            start++;
            end--;
        }

        return String.valueOf(chs);
    }
}
