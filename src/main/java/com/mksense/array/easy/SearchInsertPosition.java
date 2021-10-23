package com.mksense.array.easy;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return
 * the index where it would be if it were inserted in order.
 *
 * <p>You may assume no duplicates in the array.
 *
 * <p>Example 1:
 *
 * <p>Input: [1,3,5,6], 5 Output2 Example 2: *
 *
 * <p>Input: [1,3,5,6], 2 Output: 1 Example 3:
 *
 * <p>Input: [1,3,5,6], 7 Output: 4 Example 4:
 *
 * <p>Input: [1,3,5,6], 0 Output: 0
 *
 * @author lubosson
 * 
 * @since 2020-08-26
 */
public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		int i = 0;

		while (nums[i] < target) {
			i++;
			if (i == nums.length) {
				return i;
			}
		}

		return i;
	}

}
