class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      
            
 //       example :  1 1 0 1 1 1     ---->  return 3 
 //                          ^
 //                            ^
//         count = 4
    
      
        
        int maximum=0;
        int i=0;
    
        
        while(i<nums.length){
        
            int conOnes=0; 
        
            while(i< nums.length && nums[i]==1){
                conOnes++; 
                i++;  
        }
            maximum=Math.max(maximum,conOnes); 
            i++; 
        }
        
        return maximum; 
        
        
        
    }
}