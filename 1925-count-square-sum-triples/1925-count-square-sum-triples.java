class Solution {
    public int countTriples(int n) {
        int count = 0; 
       for(int i = 1 ; i <= n ; i++){
           for(int j = i + 1 ; j <= n ;j++){
               for(int k = j + 1 ; k <= n ; k++){
                   if(Math.pow(i,2) + Math.pow(j ,2) == Math.pow(k , 2)) count += 2;
               }
           }
       }
        
        return count;
    }
}