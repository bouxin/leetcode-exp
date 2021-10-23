package com.mksense.array.easy;

/**
 * Given an integer array nums, find the contiguous subarray (containing
 * at least one number) which has the largest sum and return its sum.
 *
 * <p>Example:
 *
 * <p>Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * <p>If you have figured out the O(n) solution, try coding another solution
 * using the divide and conquer approach, which is more subtle.
 *
 * @author lubosson
 * 
 * @since 2020-08-26
 */
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE, sum = 0;

		for (int num : nums) {
			if (sum < 0) {
				sum = num;
			} else {
				sum += num;
			}

			if (sum > max) {
				max = sum;
			}
		}

		return max;
	}
}
