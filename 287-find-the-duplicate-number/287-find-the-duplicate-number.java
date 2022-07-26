class Solution {

    public int findDuplicate(int[] nums) {
       
        int dup = nums.length; 
        
        for(int i : nums) {
            int index = Math.abs(i);
            if(nums[index] < 0){
                return index; 
            }
            nums[index] = -nums[index];
        }
        return dup ;
        
    }
}
