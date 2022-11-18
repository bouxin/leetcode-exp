package com.mksense.algos1.day7;

/**
 * <a href="https://leetcode.com/problems/max-area-of-island/?envType=study-plan&id=algorithm-i">
 *     Original link
 * </a>
 */
public class MaxAreaOfIsland {

    public static void main(String[] args) {
        MaxAreaOfIsland mail = new MaxAreaOfIsland();
        int[][] island = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int expectedArea = 6;

        int area = mail.maxAreaOfIsland(island);
        assert expectedArea == area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                area = Math.max(area, area(grid, i, j, seen));
            }
        }

        return area;
    }

    public int area(int[][] island, int r, int c, boolean[][] seen) {
        if (r < 0
                || r >= island.length
                || c < 0
                || c >= island[0].length
                || seen[r][c]
                || island[r][c] == 0) {
            return 0;
        }

        seen[r][c] = true;
        return 1 + area(island, r + 1, c, seen)
                + area(island, r - 1, c, seen)
                + area(island, r, c + 1, seen)
                + area(island, r, c -1, seen);
    }
}
