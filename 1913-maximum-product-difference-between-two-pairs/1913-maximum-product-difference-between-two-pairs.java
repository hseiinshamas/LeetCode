class Solution {
    public int maxProductDifference(int[] nums) {
 
         
        int min1=Integer.MAX_VALUE , min2=Integer.MAX_VALUE ,max1=0, max2=0;
   
        for(int i = 0 ; i<nums.length ; i++){
    
            if (nums[i] > max2){
       
                max2 = nums[i];
        
                if(nums[i] > max1){
            
                    max2 = max1;
            
                    max1 = nums[i];
         }
     }   
    
            if(nums[i] < min2){
        
                min2 = nums[i];
        
                if(nums[i] < min1){
           
                    min2 = min1;
             
                    min1 = nums[i];
         }
     }      
   }
   
        return (max2 * max1) - (min2 * min1);
    }
}