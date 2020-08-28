package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-28
 */
public class PascalsTriangleTest {

  private int numRows = 3;
  private List<List<Integer>> expectedCase;

  @Before
  public void before() {
    expectedCase = new ArrayList<List<Integer>>(numRows);
    expectedCase.add(new ArrayList<Integer>(1));
    expectedCase.add(new ArrayList<Integer>(2));
    expectedCase.add(new ArrayList<Integer>(3));

    expectedCase.get(0).add(1);

    expectedCase.get(1).add(1);
    expectedCase.get(1).add(1);


    expectedCase.get(2).add(1);
    expectedCase.get(2).add(2);
    expectedCase.get(2).add(1);
  }


  @Test
  public void test_generate_expectRightGenerated() {
    PascalsTriangle pt = new PascalsTriangle();

    List<List<Integer>> result = pt.generate(numRows);

    assertEquals(expectedCase.toString(), result.toString());
  }

  @Test
  public void test_generate_exceptWrongGenerated() {
    PascalsTriangle pt = new PascalsTriangle();

    List<List<Integer>> result = pt.generate(numRows + 1);

    assertNotEquals(expectedCase.toString(), result.toString());
  }
}