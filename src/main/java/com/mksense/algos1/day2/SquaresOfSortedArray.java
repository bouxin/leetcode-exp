package com.mksense.algos1.day2;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 *
 * <p>
 * Example 1:
 *      Input: nums = [-4,-1,0,3,10]
 *      Output: [0,1,9,16,100]
 *
 * <p>
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * <p>
 * Example 2:
 *      Input: nums = [-7,-3,2,3,11]
 *      Output: [4,9,9,49,121]
 *
 * <p>
 * Constraints:
 *      1 <= nums.length <= 10^4
 *      -10^4 <= nums[i] <= 10^4
 *      nums is sorted in non-decreasing order.
 *
 * <p>
 * Follow up: Squaring each element and sorting the new array is very trivial,
 * could you find an O(n) solution using a different approach?
 *
 * @author bouxin
 * @since 1.0
 */
public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] expected = {4,9,9,49,121};

        SquaresOfSortedArray sosa = new SquaresOfSortedArray();
        int[] actual = sosa.sortedSquares(nums);

        for (int i = 0; i < expected.length; i++) {
            assert  actual[i] == expected[i];
        }
    }

    public int[] sortedSquares(int[] nums) {

        return nums;
    }
}
