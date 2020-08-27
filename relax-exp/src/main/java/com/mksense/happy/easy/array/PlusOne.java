package com.mksense.happy.easy.array;

/**
 * Given a non-empty array of digits representing a non-negative integer,
 * increment one to the integer.
 *
 * <p>The digits are stored such that the most significant digit is at the head of
 * the list, and * each element in the array contains a single digit.
 *
 * <p>You may assume the integer does not contain any leading zero,
 * except the number 0 itself.
 *
 * <p>Example 1:
 *
 * <p>Input: digits = [1,2,3] Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * <p>Input: digits = [4,3,2,1] Output: [4,3,2,2]
 * Explanation: The array represents the integer
 * 4321. Example 3:
 *
 * <p>Input: digits = [0] Output: [1]
 *
 * <p>Constraints:
 *
 * <p>1 <= digits.length <= 100 0 <= digits[i] <= 9
 *
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-27
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {
		int ten = 10;
    for (int i = digits.length - 1; i >= 0;) {
	    if (digits[i] + 1 == ten) {
		    digits[i] = 0;

		    if (i == 0) {
		    	int[] nums = new int[digits.length + 1];
		      System.arraycopy(digits, 0, nums, 1, digits.length);
		      nums[0] = 1;

		      return nums;
		    }
		    i--;
	    } else {
		    digits[i] += 1;
		    break;
	    }
    }

    return digits;
	}

}
