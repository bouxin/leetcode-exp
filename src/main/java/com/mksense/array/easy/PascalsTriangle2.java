package com.mksense.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.
 *
 * <p>Notice that the row index starts from 0.
 *
 * <p>In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 *
 * <p>Follow up:
 *
 * <p>Could you optimize your algorithm to use only O(k) extra space?
 *
 * <p>Example 1:
 *
 * <p>Input: rowIndex = 3 Output: [1,3,3,1] Example 2:
 *
 * <p>Input: rowIndex = 0 Output: [1] Example 3:
 *
 * <p>Input: rowIndex = 1 Output: [1,1]
 *
 * <p>Constraints:
 *
 * <p>0 <= rowIndex <= 40
 *
 * @author lubosson
 * 
 * @since 2020-08-28
 */
public class PascalsTriangle2 {

	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> triangle = generate(rowIndex + 1);

		return triangle.get(rowIndex);
	}

	public List<List<Integer>> generate(int numRows) {
		if (numRows <= 0) {
			return Collections.emptyList();
		}

		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		// initialize the first floor
		triangle.add(new ArrayList<Integer>(1));
		triangle.get(0).add(1);

		int i = 1;
		while (i < numRows) {
			List<Integer> floor = new ArrayList<Integer>(i + 1);
			List<Integer> prevFloor = triangle.get(i - 1);

			floor.add(0, 1);

			for (int j = 1; j < i; j++) {
				floor.add(prevFloor.get(j - 1) + prevFloor.get(j));
			}

			floor.add(i, 1);

			triangle.add(floor);
			i++;
		}

		return triangle;
	}
}
