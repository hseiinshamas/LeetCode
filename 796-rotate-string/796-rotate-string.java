class Solution {
    public boolean rotateString(String s, String goal) {
        
        for(char c : s.toCharArray()){
            String first = s.substring(0,1); 
            String other = s.substring(1,s.length()); 
            s = other+first; 
            
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}