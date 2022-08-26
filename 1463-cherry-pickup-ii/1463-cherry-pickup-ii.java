class Solution {

    public int cherryPickup(int[][] grid) {
        int n = grid.length; 
        int m = grid[0].length;
        
        // dp step 1 
        int[][][] dp = new int[n][m][m];
        for(int[][]row : dp){
            for(int[] r : row){
                Arrays.fill(r, -1);
            }
        }
        
        return getMax(0, 0, grid[0].length - 1, grid,dp);
    }
                                                                
    private static int getMax(int i, int j1, int j2, int[][] grid, int[][][]dp) {
        int n = grid.length;
        int m = grid[0].length;
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) return (int) (Math.pow(-10, 9));
        if (i == n - 1) {
            if (j1 == j2) return grid[i][j1]; else return grid[i][j1] + grid[i][j2];
        }
        
        // dp 2nd step
        if(dp[i][j1][j2]!= -1) return dp[i][j1][j2];

        int max = Integer.MIN_VALUE;
        
        for (int di = -1; di <= 1; di++) {
            for (int dj = -1; dj <= 1; dj++) {
                int ans;
                
                if (j1 == j2) 
                    ans = grid[i][j1] + getMax(i + 1, j1 + di, j2 + dj, grid,dp); 
                else ans = grid[i][j1] + grid[i][j2] + getMax(i + 1, j1 + di, j2 + dj,grid,dp);
              
                max = Math.max(max, ans);
            }
        }
        // dp last step 
        return dp[i][j1][j2] = max;
        }
}
