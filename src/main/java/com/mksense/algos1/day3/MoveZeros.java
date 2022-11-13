package com.mksense.algos1.day3;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 *
 * <p>
 * Example 1:
 *      Input: nums = [0,1,0,3,12]
 *      Output: [1,3,12,0,0]
 *
 * <p>
 * Example 2:
 *      Input: nums = [0]
 *      Output: [0]
 *
 * <p>
 *  Constraints:
 *      1 <= nums.length <= 10^4
 *      -2^31 <= nums[i] <= 2^31 - 1
 *
 * <p>
 *Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        MoveZeros mz = new MoveZeros();
        mz.moveZeros(nums);

        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expected[i];
        }
    }

    public void moveZeros(int[] nums) {
        int pos = 0;
        int cur = 0;

        for (int i = 0; i < nums.length; i++) {
            
        }
    }
}
