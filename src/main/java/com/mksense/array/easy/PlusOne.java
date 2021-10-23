package com.mksense.array.easy;

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
 * 
 * @since 2020-08-27
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0;) {
	    if (digits[i] == 9) {
		    digits[i] = 0;

		    if (i == 0) {
		    	int[] nums = new int[digits.length + 1];
		      System.arraycopy(digits, 0, nums, 1, digits.length);
		      nums[0] = 1;

		      return nums;
		    }
		    i--;
	    } else {
		    digits[i]++;
				break;
	    }
    }

    return digits;
	}
	
	public int[] plusOne2(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
	    if (digits[i] < 9) {
	    	digits[i]++;
	    	return digits;
	    }

	    digits[i] = 0;
    }

    // running here, we know all the original digits elements is 9
    // now all the digits elements now should be 0
		// just new an <code>digits.length + 1</code> array
		// with initialized elements 0 filled there
		// change the first element to 1
    int[] nums = new int[digits.length + 1];
    nums[0] = 1;

    return nums;
	}

}
