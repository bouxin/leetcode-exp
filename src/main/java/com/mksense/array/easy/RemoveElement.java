package com.mksense.array.easy;


/**
 * Given an array nums and a value val, remove all instances of that value in-place
 * and return the new length.
 *
 * <p>Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 *
 * <p>The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 *
 * <p>Example 1:
 *
 * <p>Given nums = [3,2,2,3], val = 3,
 *
 * <p>Your function should return length = 2, with the first two elements of nums
 * being 2.
 *
 * <p>It doesn't matter what you leave beyond the returned length. Example 2:
 *
 * <p>Given nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * <p>Your function should return length = 5, with the first five elements of nums
 * containing 0, 1, 3, 0, and 4.
 *
 * <p>Note that the order of those five elements can be arbitrary.
 *
 * <p>It doesn't matter what values are set beyond the returned length.
 *
 * @author lubosson
 * 
 * @since 2020-08-24
 */
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int current = 0;

    for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != val) {
	    	nums[current] = nums[i];
		    current++;
	    }
    }

    return current;
	}


	public int removeElement2(int[] nums, int val) {
		int current = 0;

    for (int i = 0; i < nums.length; i++) {
    	if (nums[i] != val) {
		    int temp = nums[current];
		    nums[current] = nums[i];
		    nums[i] = temp;
    		current++;
	    }
    }

    return current;
	}
}
