package com.mksense.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows
 * of Pascal's triangle.
 *
 * <p>In Pascal's triangle, each number is the sum of the two numbers
 * directly above it.
 *
 * <p>Example:
 *
 * <p>Input: 5 Output: [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
 *
 * @author lubosson
 * 
 * @since 2020-08-28
 */
public class PascalsTriangle {

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
