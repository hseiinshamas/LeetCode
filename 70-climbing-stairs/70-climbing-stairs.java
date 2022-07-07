class Solution {
    public int climbStairs(int n) {
        // it takes n steps to reach the top
        // kl mara fina netlaa ya 1 step or  2 steps... 
        
        if(n == 1) return 1 ; 
        if(n == 2) return 2; 
        
        
        int n1 = 1; 
        int n2 = 2; 
        int n3 = 0;  
        
        for(int i = 3 ; i<=n ;i++){
            n3 = n1 + n2; 
            n1 = n2; 
            n2 = n3; 
            
          
        }
        
        return n3;
    }
}