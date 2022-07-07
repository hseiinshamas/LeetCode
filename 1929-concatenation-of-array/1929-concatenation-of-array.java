class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]ans = new int [2 * nums.length]; 
      
        int i = 0 ; 
        int j = 0 ; 
        
        while(i<nums.length){
            ans[j] = nums[i]; // {1 , 2 , 1 , , , }
            i++;
            j++;
        }
        
        for(int k = 0 ; k < nums.length; k++)
            ans[j++]=nums[k];
        
        return ans;
    }
}