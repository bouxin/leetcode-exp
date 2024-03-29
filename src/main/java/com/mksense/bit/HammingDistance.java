package com.mksense.bit;

import java.beans.PropertyEditorSupport;
import java.nio.file.SimpleFileVisitor;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, return the Hamming distance between them.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.
 * Example 2:
 *
 * Input: x = 3, y = 1
 * Output: 1
 *
 *
 * Constraints:
 *
 * 0 <= x, y <= 2e31 - 1
 *
 * @author Lue
 * @date 2021-10-24
 */
public class HammingDistance {

    public static void main(String[] args) {
        HammingDistance solution = new HammingDistance();
        System.out.println(solution.hammingDistance3(4, 1));
    }

    public int hammingDistance(final int x, final int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        int step = binaryX.length() - binaryY.length();
        // make two number's binary array length equals
        StringBuilder sb = new StringBuilder();
        if (step < 0) {
            for (int i = 0; i < -step; i++) {
                sb.append(0);
            }
            binaryX = sb.append(binaryX).toString();
        } else {
            for (int i = 0; i < step; i++) {
                sb.append(0);
            }
            binaryY = sb.append(binaryY).toString();
        }
        int distance = 0;
        for (int i = 0; i < binaryY.length(); i++) {
            char binx = binaryX.charAt(i);
            char biny = binaryY.charAt(i);
            if ((binx ^ biny) == 1) {
                distance += 1;
            }
        }
        return distance;
    }

    public int hammingDistance2(final int x, final int y) {
        int distance = 0;
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            int ex = (x & mask) == 0 ? 0 : 1;
            int ey = (y & mask) == 0 ? 0 : 1;
            if ((ex ^ ey) == 1) {
                distance += 1;
            }
        }
        return distance;
    }

    public int hammingDistance3(int x, int y) {
        int distance = 0;
        while (x != 0 || y != 0) {
            distance += (x & 1) ^ (y & 1);
            x >>= 1;
            y >>= 1;
        }
        return distance;
    }

}
