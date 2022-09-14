class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1]; 
        for(int[]row : dp) Arrays.fill(row, -1);
        return getNum(s, t, s.length() - 1, t.length() - 1, dp);
    }

    private int getNum(String s, String t, int i, int j, int[][]dp) {
        // base case
        if (j < 0) return 1;
        if (i < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if (s.charAt(i) == t.charAt(j)) 
            return dp[i][j] =
            getNum(s, t, i - 1, j - 1, dp) + getNum(s, t, i - 1, j, dp);
        
        else return dp[i][j] = getNum(s, t, i - 1, j, dp);
    }
}
