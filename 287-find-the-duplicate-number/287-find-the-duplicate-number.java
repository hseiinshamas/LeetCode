class Solution {
    public int findDuplicate(int[] nums) {
       
        int dup = 0;
        if(nums.length == 0) return dup;
       
       Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length-1; i++) { 
            if(nums[i] == nums[i+1])
                dup = nums[i];
        }
        
        return dup;
    }
}