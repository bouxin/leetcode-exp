package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-27
 */
public class PlusOneTest {

  @Test
  public void test_plusOne_expectRightReturned() {
    int[] digits = new int[] { 9 };
    int[] expected = new int[] { 1, 0 };
    PlusOne po = new PlusOne();

    assertEquals(Arrays.toString(expected), Arrays.toString(po.plusOne2(digits)));
  }
}