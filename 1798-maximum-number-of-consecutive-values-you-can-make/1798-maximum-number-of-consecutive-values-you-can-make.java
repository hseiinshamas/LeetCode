class Solution {
    public int getMaximumConsecutive(int[] coins) {
     
        Arrays.sort(coins);
        int max = 0 ; 
        for(int coin : coins){
            if( coin > max + 1 ) break; 
            max+=coin;
        }
        return max+1; // 1 > 1? no max = 1 ; 1 > 2? no max = 2 ; 1 > 2 ? max = 3 
        // 4 > 4? no max 8; break 
    }
}

