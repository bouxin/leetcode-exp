package com.mksense.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 *
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 *
 * Return the decompressed list.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 * Example 2:
 *
 * Input: nums = [1,1,2,3]
 * Output: [1,3,3]
 *
 *
 * Constraints:
 *
 *      2 <= nums.length <= 100
 *      nums.length % 2 == 0
 *      1 <= nums[i] <= 100
 *
 * @author Lue
 * @date 2021-10-23
 */
public class DecompressRLEList {

    public int[] decompressRLEList(final int[] nums) {
        // num must appears in pairs
        if (nums.length < 2 || nums.length > 100 || nums.length % 2 != 0) {
            throw new RuntimeException();
        }
        // the given array nums always in pairs, so we can get the new compressed array max length,
        // just sum the nums[i] index follow 1, 3, 5, ..... i + 2 within nums.length.
        int arrayLen = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] < 1 || nums[i] > 100) throw new RuntimeException();
            arrayLen += nums[i];
        }
        // last filled array index
        int cursor = 0;
        int[] results = new int[arrayLen];
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i]; int value = nums[i+1];
            if (freq > 0) {
                for (int j = 0; j < freq; j++) {
                    results[cursor+j] = value;
                }
                cursor += freq;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,5,1,3,4};
        DecompressRLEList solution = new DecompressRLEList();
        int[] compressedNums = solution.decompressRLEList(nums);
        System.out.println(Arrays.toString(compressedNums));
    }
}
