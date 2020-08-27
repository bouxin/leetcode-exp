package com.mksense.happy.easy.array;

import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-21
 */
public class TwoSumTest {

  @Test
  public void twoSum_rightOutput() {
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 9;

    TwoSum sum = new TwoSum();

    sum.twoSum(nums, target);
  }

  @Test
  public void twoSum_throwEx() {
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