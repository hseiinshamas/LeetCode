class Solution {
    public int numIdenticalPairs(int[] nums) {
         
  
        int ans = 0;
    
        int[] f = new int[101];
   
        for (int i = 0; i < nums.length; ++i)      
      
        ans += f[nums[i]]++;
        
        
        return ans;
    }
}