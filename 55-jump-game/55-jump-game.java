class Solution {

    public boolean canJump(int[] nums) {
        // each element in the array is the number of jumps ..\
       
        int lastIndex = nums.length - 1; 
        for(int i = nums.length - 1 ; i>=0; i--){
            if(i + nums[i] >= lastIndex){
                lastIndex = i ; 
            }
                
        }
        return lastIndex == 0 ;
        
    }
}
// 3 4 3 2 1