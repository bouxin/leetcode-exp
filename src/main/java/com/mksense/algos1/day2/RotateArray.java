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
        int[] nums = {1,2};
        int k = 2;
        RotateArray ra = new RotateArray();
        ra.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        System.out.println(2%2);
    }

    public void rotate(int[] nums, int k) {
        if (nums.length == 1) return;

        if (k >= nums.length) {
            k = k % nums.length;
        }

        if (k == 0) return;

        int cur = nums.length - 1;
        int[] res = new int[nums.length];

        if (k > nums.length) {
            k = k % nums.length;
        }

        int l = k;
        for (int i = 0; i < nums.length - l; i++) {
            if (k > 0) {
                res[--k] = nums[cur--];
            }
            res[l + i] = nums[i];
        }

        System.arraycopy(res, 0, nums, 0, res.length);
    }
}
