package com.mksense.algos1.day1;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 *
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * <p>
 * Example 1:
 *      Input: nums = [1,3,5,6], target = 5
 *      Output: 2
 *
 * <p>
 * Example 2:
 *      Input: nums = [1,3,5,6], target = 2
 *      Output: 1
 *
 * <p>
 * Example 3:
 *      Input: nums = [1,3,5,6], target = 7
 *      Output: 4
 *
 * <p>
 * Constraints:
 *      1 <= nums.length <= 10^4
 *      -10^4 <= nums[i] <= 10^4
 *      nums contains distinct values sorted in ascending order.
 *      -10^4 <= target <= 10^4
 *
 * @author bouxin
 * @since 1.0
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int excepted = 0;
        assert excepted == sip.searchInsert(nums, target);
    }

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

