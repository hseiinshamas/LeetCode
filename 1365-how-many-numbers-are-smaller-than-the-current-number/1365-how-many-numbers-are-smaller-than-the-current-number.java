class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        
        int[] sm = new int[nums.length]; 
        
        for(int i = 0 ; i<nums.length ; i++){ // outer loop
            int count = 0 ;
            
            for(int j = 0 ; j< nums.length; j++){
                if(nums[i] > nums[j])
                    count++; 
                }
            sm[i] = count; 
            
        }
        
        
        return sm; 
        
    }
}