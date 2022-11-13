package com.mksense.algos1.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 * <p>
 * Your solution must use only constant extra space.
 *
 * <p>
 * Example 1:
 *      Input: numbers = [2,7,11,15], target = 9
 *      Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 *
 * <p>
 * Example 2:
 *      Input: numbers = [2,3,4], target = 6
 *      Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 *
 * <p>
 * Example 3:
 *      Input: numbers = [-1,0], target = -1
 *      Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 *
 * <p>
 * Constraints:
 *      2 <= numbers.length <= 3 * 10^4
 *      -1000 <= numbers[i] <= 1000
 *      numbers is sorted in non-decreasing order.
 *      -1000 <= target <= 1000
 *      The tests are generated such that there is exactly one solution.
 */
public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] expected = {1,2};
        TwoSumII tsii = new TwoSumII();
        int[] actual = tsii.twoSum(numbers, target);
        System.out.println(Arrays.toString(actual));
    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>(numbers.length);

        int x = 0;
        int y = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(target - numbers[i]) != null) {
                x = map.get(target-numbers[i]) + 1;
                y = i + 1;
            } else {
                map.put(numbers[i], i);
            }
        }

        return new int[]{x,y};
    }
}
