package com.mksense.algos1.day14;

/**
 * <a href="https://leetcode.com/problems/single-number/?envType=study-plan&id=algorithm-i">Single Number</a>
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2, 11, 4, 5, 2, 11, 4};
        System.out.println(new SingleNumber().singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
