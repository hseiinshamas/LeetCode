import java.util.Arrays; 
class Solution {
    public int maxSubArray(int[] nums) {
       
        int sum = nums[0] ; 
        int maxSum = nums[0]; 
        
        for(int i = 1 ; i < nums.length ; i++){
               if(sum < 0){
                   sum = nums[i];
               }else{
                sum = sum + nums[i]; 
               }
             maxSum = Math.max(sum, maxSum);
        }
        
       
        return maxSum; 
    }
}