package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-30
 */
public class BestTimeToBuyAndSellStockTest {

  @Test
  public void test_maxProfit_expectPass() {
//    int[] prices = new int[] { 7,6,4,3,1 };
//    int[] prices = new int[] { 1, 2, 3, 4, 5, 6 };
//    int[] prices = new int[] { 6, 5, 4, 3, 2, 1 };
    int[] prices = new int[] { 7, 3, 8, 5, 9, 1 };
    int expected = 6;

    BestTimeToBuyAndSellStock bttbass = new BestTimeToBuyAndSellStock();

    assertEquals(expected, bttbass.maxProfit3(prices));
  }
}