class Solution { // count sort

    public void sortColors(int[] nums) {
        int countZeroes = 0 ; 
        int countOnes = 0; 
        int countTwo = 0; 
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] == 0) countZeroes++; 
            if(nums[i] == 1) countOnes++; 
            if(nums[i] == 2) countTwo++; 
        }
        
        for(int i = 0 ; i < countZeroes ; i++){
            nums[i] = 0 ;
        }
        
        for(int i = countZeroes ;  i < countZeroes + countOnes; i++){
            nums[i] = 1; 
        }
        
        for(int i = countZeroes+countOnes ; i < nums.length; i++){
            nums[i] = 2; 
        }
    }
}
