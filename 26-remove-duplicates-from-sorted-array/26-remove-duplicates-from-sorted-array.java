class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0; 
        
        
        for(int i = 0 ; i < nums.length-1; i++){
            if(nums[i] != nums[i+1])
                nums[j++] = nums[i]; 
        }
        nums[j++] = nums[nums.length -1]; 
        
        return j ; 
    }
}