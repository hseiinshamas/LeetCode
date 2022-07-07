class Solution {
    public boolean isPowerOfThree(int n) {
        
        if (n <= 0)
            return false;
        
        /* The maximum power of 3 value that
           integer can hold is 1162261467 ( 3^19 ) .*/
        
        return 1162261467 % n == 0;
    
    }
} 

/* recursion.. 
  
 if(n ==0)
            return false;
        if(n == 1)
            return true; 
        
        if(n%3 == 0)
            return isPowerOfThree(n/3); 
            
        
        return false; 

*/

