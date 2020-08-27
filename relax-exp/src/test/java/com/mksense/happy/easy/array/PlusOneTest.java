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
  public void plusOne() {
    int[] digits = new int[] { 9 };
    int[] excepted = new int[] { 1, 0 };
    PlusOne po = new PlusOne();

    assertEquals(Arrays.toString(excepted), Arrays.toString(po.plusOne2(digits)));
  }
}