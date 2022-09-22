class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int[]r : dp) Arrays.fill(r, -1);
        return f(0, 0 , prices, dp);
    }
    private int f(int ind , int buy, int[] p, int[][] dp){
        int profit = 0; 
        if(ind == p.length)
            return 0; 
        if(dp[ind][buy] != -1) return dp[ind][buy];
        
        if(buy == 0)
            profit = Math.max(0 + f(ind + 1, 0, p, dp) , -p[ind] + f(ind + 1 , 1 , p, dp));
        if(buy == 1)
             profit = Math.max(0 + f(ind + 1, 1, p, dp) , p[ind] + f(ind + 1 , 0 , p, dp));
            
        return dp[ind][buy] =  profit;
    }
}