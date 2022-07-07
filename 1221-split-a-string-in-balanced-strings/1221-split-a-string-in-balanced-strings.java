class Solution {
    public int balancedStringSplit(String s) {
     int countLs = 0 ; 
        int ans = 0; 
    
        for(int i = 0 ; i<s.length(); i++){
         if(s.charAt(i)=='L'){
             countLs++;
         }
         else{
             countLs--;
         }
         
         if(countLs  == 0)
             ans++;
             
     }
        return ans;
    
    }
}