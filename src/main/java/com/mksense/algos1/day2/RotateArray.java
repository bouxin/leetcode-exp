package com.mksense.algos1.day2;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * <p>
 * Example 1:
 *      Input: nums = [1,2,3,4,5,6,7], k = 3
 *      Output: [5,6,7,1,2,3,4]
 *
 * <p>
 * Explanation:
 *      rotate 1 steps to the right: [7,1,2,3,4,5,6]
 *      rotate 2 steps to the right: [6,7,1,2,3,4,5]
 *      rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * <p>
 * Example 2:
 *      Input: nums = [-1,-100,3,99], k = 2
 *      Output: [3,99,-1,-100]
 *
 * <p>
 * Explanation:
 *      rotate 1 steps to the right: [99,-1,-100,3]
 *      rotate 2 steps to the right: [3,99,-1,-100]
 *
 * <p>
 * Constraints:
 *      1 <= nums.length <= 10^5
 *      -2^31 <= nums[i] <= 2^31 - 1
 *      0 <= k <= 10^5
 *
 * @author bouxin
 * @since 1.0
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 2;
        RotateArray ra = new RotateArray();
        ra.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        if (nums.length == 1) return;
        k %= nums.length;
        if (k == 0) return;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            nums[start] += nums[end];
            nums[end] = nums[start] - nums[end];
            nums[start] = nums[start] - nums[end];
            start++;
            end--;
        }
    }
}
