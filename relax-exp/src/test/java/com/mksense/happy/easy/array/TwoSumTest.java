package com.mksense.happy.easy.array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-21
 */
public class TwoSumTest {

  @Test
  public void test_twoSum_expectRightIndexPairReturned() {
    int target = 9;
    int[] nums = new int[] { 2, 7, 11, 15 };

    int[] expected = new int[] { 0, 1 };

    TwoSum sum = new TwoSum();

    int[] result = sum.twoSum(nums, target);

    assertEquals(Arrays.toString(expected), Arrays.toString(result));
  }

  @Test
  public void test_twoSum_expectThrowException() {
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 10;

    TwoSum sum = new TwoSum();

    try{
      sum.twoSum(nums, target);
    } catch (Throwable ex) {
      if (ex instanceof RuntimeException) {
        // do nothing
      } else {
        assert false;
      }
    }
  }
}