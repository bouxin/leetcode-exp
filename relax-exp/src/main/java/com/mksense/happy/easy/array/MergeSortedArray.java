package com.mksense.happy.easy.array;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1
 * as one sorted array.
 *
 * <p>Note:
 *
 * <p>The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is equal to m + n)
 * to hold additional elements from nums2.
 * Example:
 *
 * <p>Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
 *
 * <p>Output: [1,2,2,3,5,6]
 *
 * <p>Constraints:
 *
 * <p>-10^9 <= nums1[i], nums2[i] <= 10^9 nums1.length == m + n nums2.length == n
 *
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-27
 */
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
    System.arraycopy(nums2, 0, nums1, m, n);

		bubbleSort(nums1);
	}

	public void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m + n - 1; i >= 0; i--) {
			if (m == 0 && n > 0) {
				nums1[i] = nums2[--n];
			}

			if (n == 0) {
				return;
			}

			if (m > 0 && n > 0) {
				if (nums1[m - 1] < nums2[n - 1]) {
					nums1[i] = nums2[--n];
				} else {
					nums1[i] = nums1[--m];
				}
			}
		}
	}

}
