class Solution {
    public String truncateSentence(String s, int k) {
        String res = ""; 
        int spaces = 0;
        for(int i = 0 ; i<s.length(); i++){
            res+=s.charAt(i);
            if(s.charAt(i) == ' ')
                spaces++; 
            if(spaces == k)
                break;
        }
        
        return res.trim();
    }
}