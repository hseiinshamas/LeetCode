class Solution {
    public int lengthOfLastWord(String s) {
        
        String str = s.trim(); 
        
        String [] arr = str.split(" "); 
        
        String ss = arr[arr.length-1];
        
        return ss.length(); 
        
        
        
        
        
        
    }
}