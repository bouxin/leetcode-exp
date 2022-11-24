package com.mksense.algos1.day14;

/**
 * <a href="https://leetcode.com/problems/reverse-bits/?envType=study-plan&id=algorithm-i">Reverse Bit</a>
 */
public class ReverseBit {

    public static void main(String[] args) {
    }

    public int reverseBits(int n) {
        int result = 0;

        for(int i = 0; i < 32; i++){
            result = result << 1;
            result = result | n & 1;
            n = n >> 1;
        }

        return result;
    }
}
