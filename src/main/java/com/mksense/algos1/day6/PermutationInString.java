//package com.mksense.algos1.day6;
//
//import java.util.Collections;
//import java.util.List;
//
///**
// * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// *
// * In other words, return true if one of s1's permutations is the substring of s2.
// *
// *
// *
// * Example 1:
// *      Input: s1 = "ab", s2 = "eidbaooo"
// *      Output: true
// * Explanation: s2 contains one permutation of s1 ("ba").
// *
// * Example 2:
// *      Input: s1 = "ab", s2 = "eidboaoo"
// *      Output: false
// *
// *
// * Constraints:
// *      1 <= s1.length, s2.length <= 10^4
// *      s1 and s2 consist of lowercase English letters.
// */
//public class PermutationInString {
//
//    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "bbbca";
//        PermutationInString pis = new PermutationInString();
//        System.out.println(pis.checkInclusion(s1, s2));
//    }
//
//    public boolean checkInclusion(String s1, String s2) {
//        List<String> portOfS1 = permutation(s1);
//        int len = portOfS1.size();
//        int leftWinP1 = 0;
//        int leftWinP2 = len;
//        int rightWinP1 = s2.length() - len;
//        int rightWinP2 = s2.length();
//
//        while ((rightWinP1 >= 0)) {
//            System.out.println("left => " + substr(s2, leftWinP1, leftWinP2));
//            System.out.println("right => " + substr(s2, rightWinP1, rightWinP2));
//
//            if (s1.equals(substr(s2, leftWinP1, leftWinP2))
//                    || portOfS1.equals(substr(s2, rightWinP1, rightWinP2))) {
//                return true;
//            }
//
//            leftWinP1++;
//            leftWinP2++;
//            rightWinP1--;
//            rightWinP2--;
//        }
//
//        return false;
//    }
//
//    public String substr(String src, int from, int to) {
//        char[] chars = src.toCharArray();
//
//        char[] subchars = new char[to - from];
//
//        for (int i = 0; i <= subchars.length; i++) {
//            subchars[i] = chars[from++];
//            if (from == to) {
//                break;
//            }
//        }
//
//        return String.valueOf(subchars);
//    }
//
//    public List<String> permutation(String s) {
//        if (s.length() == 1) return Collections.singletonList(s);
//
//        int lo = 0;
//        int hi = s.length() - 1;
//
//        char[] chars = s.toCharArray();
//
//        while (lo < hi) {
//            char t = chars[lo];
//            chars[lo] = chars[hi];
//            chars[hi] = t;
//            lo++;
//            hi--;
//        }
//
//        return String.valueOf(chars);
//    }
//}
