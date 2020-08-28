package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-26
 */
public class SearchInsertPositionTest {

  @Test
  public void test_searchInsert_expectTargetValueRightInserted() {
    int[] nums = new int[] { 1, 3, 5, 7, 8, 10 };
    int target = 11;

    SearchInsertPosition sip = new SearchInsertPosition();

    assertEquals(6, sip.searchInsert(nums, target));
  }
}