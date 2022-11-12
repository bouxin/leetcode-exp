package com.mksense.algos1.day1;

/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version,
 * all the versions after a bad version are also bad.
 *
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 *
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 *
 * <p>
 * Example 1:
 *      Input: n = 5, bad = 4
 *      Output: 4
 * Explanation:
 *      call isBadVersion(3) -> false
 *      call isBadVersion(5) -> true
 *      call isBadVersion(4) -> true
 *      Then 4 is the first bad version.
 *
 * <p>
 * Example 2:
 *      Input: n = 1, bad = 1
 *      Output: 1
 *
 * <p>
 * Constraints:
 *      1 <= bad <= n <= 2^31 - 1
 *
 * @author bouxin
 * @since 1.0
 */
public class FirstBadVersion {

    public static int bad = 1702766719;

    public static void main(String[] args) {
        int n = 2126753390;
        FirstBadVersion fbv = new FirstBadVersion();
        assert bad == fbv.firstBadVersion(n);
    }

    public int firstBadVersion(int n) {
        int lo = 0;
        int hi = n;;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isBadVersion(mid)) {
                hi  = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return isBadVersion(lo) ? lo : hi;
    }

    public static boolean isBadVersion(int i) {
        return i >= bad;
    }
}
