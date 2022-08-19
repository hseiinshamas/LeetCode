class Solution {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                int largest = Integer.MIN_VALUE;

                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        largest = Math.max(largest, grid[row][col]);
                    }
                }

                res[i][j] = largest;
            }
        }
        return res;
    }
}
