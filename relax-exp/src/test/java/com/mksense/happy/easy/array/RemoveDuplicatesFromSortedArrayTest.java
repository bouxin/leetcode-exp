package com.mksense.happy.easy.array;


import java.util.Arrays;
import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author lubosson
 * @see com.mksense.happy.easy.array
 * @since 2020-08-24
 */
public class RemoveDuplicatesFromSortedArrayTest {

  @Test
  public void test_removeDuplicates_expectDuplicatesRemoved() {
    int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4 };
    HashSet<Integer> set = putAllToHashSet(nums);

    RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();

    int size = rdfsa.removeDuplicates(nums);
    System.out.println(Arrays.toString(nums));
    Assert.assertSame(set.size(), size);
  }

  private HashSet<Integer> putAllToHashSet(int[] nums) {
    HashSet<Integer> hashSet = new HashSet<Integer>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      hashSet.add(nums[i]);
    }

    return hashSet;
  }
}