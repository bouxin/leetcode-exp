package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-24
 */
public class RemoveElementTest {

  @Test
  public void removeElement_right_output() {
    int[] nums = new int[] { 0,1,2,2,3,0,4,2 };
    int val = 2;

    RemoveElement re = new RemoveElement();

    assertEquals(5, re.removeElement(nums, val));
  }
}