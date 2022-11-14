package com.mksense.algos1.day4;


import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * <p>
 * Example 1:
 *      Input: s = ["h","e","l","l","o"]
 *      Output: ["o","l","l","e","h"]
 *
 * <p>
 * Example 2:
 *      Input: s = ["H","a","n","n","a","h"]
 *      Output: ["h","a","n","n","a","H"]
 *
 * <p>
 * Constraints:
 *      1 <= s.length <= 10^5
 *      s[i] is a printable ascii character.
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        ReverseString rs = new ReverseString();
        rs.reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
            start++;
            end--;
        }
    }
}
