class Solution {
    public boolean detectCapitalUse(String word) {
       
        
        int len = word.length();
        String sub = word.substring(1,len); 
        if(word.equals(word.toUpperCase())) return true; 
        else if(Character.isUpperCase(word.charAt(0))
                                      && sub.equals(sub.toLowerCase())) 
                return true;
        else if(word.equals(word.toLowerCase())) return true;
        else return false;
        
        
    }
}