package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;

/**
 * @author lubosson
 * @version 1.0
 * @since 2020-10-24
 */
public class BestTimeToBuyAndSellStockIITest {

  @Test
  public void when_maxProfit_then_passAsExpected() {
    BestTimeToBuyAndSellStockII btbsii = new BestTimeToBuyAndSellStockII();

    int[] prices = { 7, 2, 6, 8, 11, 7 };
    int expected = 9;

    assertEquals(expected, btbsii.maxProfit(prices));
  }
  
}