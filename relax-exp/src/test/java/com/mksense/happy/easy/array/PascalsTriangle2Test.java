package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-28
 */
public class PascalsTriangle2Test {

  @Test
  public void test_getRow_expectRightReturned() {
    int rowIndex = 2;
    List<Integer> expected = Arrays.asList(1, 2, 1);

    PascalsTriangle2 pt2 = new PascalsTriangle2();

    List<Integer> result = pt2.getRow(rowIndex);

    assertEquals(expected.toString(), result.toString());
  }
}