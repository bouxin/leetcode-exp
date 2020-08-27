package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-26
 */
public class MaximumSubarrayTest {

  @Test
  public void maxSubarray_right_output() {
    int[] nums = new int[] { -2, -1 };

    MaximumSubarray ms = new MaximumSubarray();

    assertEquals(-1, ms.maxSubArray(nums));
  }
}