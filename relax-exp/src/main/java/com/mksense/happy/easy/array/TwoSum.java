package com.mksense.happy.easy.array;

import com.mksense.happy.exceptions.ArgumentException;
import com.mksense.happy.exceptions.SatisfyException;
import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 *
 * <p>You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * <p>Example:
 *
 * <p>Given nums = [2, 7, 11, 15], target = 9,
 *
 * <p>Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-21
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		if (nums.length == 0) {
			throw new ArgumentException("no elements contains in the nums array");
		}

		HashMap<Integer, Integer> dotpairs = new HashMap<Integer, Integer>(nums.length);

    for (int i = 0; i < nums.length; i++) {
    	int y = target - nums[i];
			if (dotpairs.get(y) != null) {
				return new int[] { dotpairs.get(y), i };
			}

	    dotpairs.put(nums[i], i);
    }

    throw new SatisfyException("no satisfied pairs~");
	}
}
