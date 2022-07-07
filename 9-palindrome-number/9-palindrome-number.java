class Solution {
    public boolean isPalindrome(int x) {
        
        boolean flag = true; 
        int remainder; 
        int temp = x; 
        int reverse = 0; 
        
        while(x>0){
            remainder = x%10; 
            reverse = reverse * 10 + remainder; 
            x = x / 10; 
        }
        if(reverse != temp){
            flag = false; 
        }
        return flag; 
    }
}