class Solution {
    public int[] buildArray(int[] nums) {

        //  nums[nums[0]] = solve for the inside .. nums[0] = 0 .. then nums[nums[0]] = 0
        //  nums[nums[1]] = nums[1] = 2 .. nums[2] = 1 add to the array 
        
        int[] ans = new int[nums.length];
        int j  = 0 ;
      
      for(int i = 0 ; i < ans.length; i++){
         j = nums[i]; /// 5
          ans[i] = nums[j] ; 
      }
        return ans; 
        
    }
}