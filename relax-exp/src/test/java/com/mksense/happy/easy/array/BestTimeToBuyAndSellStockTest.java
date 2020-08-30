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
    int[] prices = new int[] { 7,1,5,3,6,4 };
    int expected = 5;

    BestTimeToBuyAndSellStock bttbass = new BestTimeToBuyAndSellStock();

    assertEquals(expected, bttbass.maxProfit(prices));
  }
}