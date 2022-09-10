class Solution {
    public int minInsertions(String s) {
       StringBuilder sb = new StringBuilder(s); 
        String s2 = sb.reverse().toString();
        int n = s.length();
        int m = s2.length();
        int[][]dp = new int[n][m]; 
        for(int[]r : dp) Arrays.fill(r, -1); 
        return s.length() -  getLong(s, s2, n-1, m-1, dp);
    
    }
    
    private int getLong(String s1, String s2, int ind1, int ind2, int[][]dp){
         // base case 
        if(ind1 < 0 || ind2 < 0) return 0; 
        if(dp[ind1][ind2] != -1) return dp[ind1][ind2]; 
        
        // match
        if(s1.charAt(ind1) == s2.charAt(ind2))
            return dp[ind1][ind2] = 1 +  getLong(s1, s2, ind1-1, ind2-1,dp); 
       
        else return dp[ind1][ind2] = 0 + Math.max(
            getLong(s1,s2, ind1-1, ind2, dp),
            getLong(s1,s2, ind1, ind2-1, dp)); 
    }
}   