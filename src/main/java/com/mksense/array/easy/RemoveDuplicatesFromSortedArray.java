package com.mksense.array.easy;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element
 * appear only once and return the new length.
 *
 * <p>Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 *
 * <p>Example 1:
 *
 * <p>Given nums = [1,1,2],
 *
 * <p>Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively.
 *
 * <p>It doesn't matter what you leave beyond the returned length. Example 2:
 *
 * <p>Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * <p>Your function should return length = 5, with the first five elements of nums
 * being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * <p>It doesn't matter what values are set beyond the returned length.
 *
 * @author lubosson
 * @since 2020-08-24
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] expectedNums = {0,1,2,3,4,0,0,0,0,0};
		
		int k = rdfsa.removeDuplicates(nums);

		for (int i = 0; i < k; i++) {
			assert nums[i] == expectedNums[i];
		}
		System.out.println("bingo~");
	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int pos = 0;
		int cur = 0;

		while (cur < nums.length - 1) {
			if (nums[pos] != nums[++cur]) {
		  		if (++pos == cur) {
		  			continue;
		  		}
		  		nums[pos] = nums[cur];
		  	}
		}

		return pos + 1;
	}

	public int removeDuplicates2(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int position = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[position] != nums[i]) {
				position++;
				if (position == i) {
					continue;
				}
				nums[position] = nums[i];
			}
		}

		return position + 1;
	}
}
