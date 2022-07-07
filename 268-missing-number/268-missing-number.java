class Solution {
    public int missingNumber(int[] nums) {
       
   Arrays.sort(nums);
       
        if(nums[0] != 0)
            return 0;
       
       int i = 1 ; 
       
        for(i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] != 1)
                return i;
        }
        
        return i;
    }
}