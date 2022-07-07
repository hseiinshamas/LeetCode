class Solution {
    public boolean divideArray(int[] nums) {
    if(nums.length%2!= 0)
            return false; 
   
       Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i+=2) {
            if(nums[i]!=nums[i+1]) {
                return false;
            }
        }
        return true; // 2 2 2 2 3 3 
    }
}