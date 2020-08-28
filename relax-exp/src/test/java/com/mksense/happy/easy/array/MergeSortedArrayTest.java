package com.mksense.happy.easy.array;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-27
 */
public class MergeSortedArrayTest {

  @Test
  public void merge_right_output() {
    int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = new int[] { 2, 5, 6 };
    int m = 3, n = 3;
    int[] excepted = new int[] { 1, 2, 2, 3, 5, 6 };

//    int[] nums1 = new int[] { 0 };
//    int[] nums2 = new int[] { 1 };
//    int m = 0, n = 1;
//    int[] excepted = new int[] { 1 };

//    int[] nums1 = new int[] { 1 };
//    int[] nums2 = new int[] { 0 };
//    int m = 1, n = 0;
//    int[] excepted = new int[] { 1 };


    MergeSortedArray msa = new MergeSortedArray();

    msa.merge(nums1, m, nums2, n);

    System.out.println(Arrays.toString(nums1));
    assertEquals(Arrays.toString(excepted), Arrays.toString(nums1));
  }

}