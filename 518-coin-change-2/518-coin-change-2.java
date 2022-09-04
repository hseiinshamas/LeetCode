class Solution {
    public int change(int amount, int[] coins) {
      
        int n = coins.length;
        int[][]dp = new int[n][amount + 1];
        for(int[]row : dp) Arrays.fill(row, -1);
        return getChange(n-1, amount, coins,dp);
        
    }
    
    private int getChange(int ind, int target, int[] coins, int[][] dp){
        
        if(ind == 0){
            if (target % coins[0] == 0) return 1; 
            else return 0;
        }
        
        if(dp[ind][target] != -1) return dp[ind][target];
        
        int notTake = getChange(ind-1, target, coins, dp);
        int take = 0;
       
        if(coins[ind] <= target){
        
            // we don't move the index because we can pick it more than one time.
            take = getChange(ind, target-coins[ind], coins, dp); 
            
        }
        
        return dp[ind][target] =  take+notTake; 
    }
}