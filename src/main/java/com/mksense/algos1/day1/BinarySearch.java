package com.mksense.algos1.day1;

/**
 * <p>
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * <p>
 * Example 1:
 *      Input: nums = [-1,0,3,5,9,12], target = 9
 *      Output: 4
 *      Explanation: 9 exists in nums and its index is 4
 *
 * <p>
 * Example 2:
 *      Input: nums = [-1,0,3,5,9,12], target = 2
 *      Output: -1
 *      Explanation: 2 does not exist in nums so return -1
 *
 * <p>
 * Constraints:
 *      1 <= nums.length <= 104
 *      -104 < nums[i], target < 104
 *      All the integers in nums are unique.
 *      nums is sorted in ascending order.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int output = 4;
        BinarySearch bs = new BinarySearch();
        assert output == bs.binarySearch(nums, target);
    }

    public int binarySearch(int[] nums, int target) {
        return -1;
    }
}
