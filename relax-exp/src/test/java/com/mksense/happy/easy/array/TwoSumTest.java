package com.mksense.happy.easy.array;

import com.mksense.happy.exceptions.SatisfyException;
import org.junit.Assert;
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
  public void twoSum_throwSatisfyEx() {
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 10;

    TwoSum sum = new TwoSum();

    try{
      sum.twoSum(nums, target);
    } catch (RuntimeException ex) {
      if (ex instanceof SatisfyException) {
        // do nothing
      } else {
        assert false;
      }
    }
  }
}