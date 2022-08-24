class Solution {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
      
        // memoization step 1
        int[][] dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);

        return getPath(grid, m - 1, n - 1, dp);
    }

    private int getPath(int[][] grid, int i, int j, int[][] dp) {
        
        // base case 
        if (i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return (int) Math.pow(10, 9);

        // step 2 memo
        if (dp[i][j] != -1) return dp[i][j];

        int down = grid[i][j] + getPath(grid, i - 1, j, dp);

        int right = grid[i][j] + getPath(grid, i, j - 1, dp);

        // step 3
        return dp[i][j] = Math.min(down, right);
    }
}
