class Solution {
    public int getMaximumConsecutive(int[] coins) {
     
        Arrays.sort(coins);
        int max = 1 ; 
        for(int coin : coins){
            if( coin > max) break; 
            max+=coin;
        }
        return max; 
        
    }
}


//  Arrays.sort(coins);
//         int result=1;
        
//         int idx=0;
//         while(idx<coins.length && result>=coins[idx]){
//             result+=coins[idx];
//             idx++;
//         }
//         return result;
