class Solution {
    public int[] sumZero(int n) {
       
        int[] result = new int[n];
   
        int idx = 0;
   
        int half = n / 2;
    
        for (int i = -1 * half; i < 0; i++) { // -2 
      
            result[idx++] = i; //  - 1  1 2  
    
        }
    
        if (n % 2 != 0) { // 3 4 5 
      
            result[idx++] = 0;
   
        }
    
        for (int i = 1; i <= half; i++) {
      
            result[idx++] = i;
   
        }
    
        return result;
    }
}

// [-9 , 0]


