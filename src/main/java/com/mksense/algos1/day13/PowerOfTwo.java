package com.mksense.algos1.day13;

/**
 * <a href="https://leetcode.com/problems/power-of-two/?envType=study-plan&id=algorithm-i">Power of Two</a>
 */
public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo pot = new PowerOfTwo();
        int n = 1;
        System.out.println(pot.isPowerOfTwo(n));
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
