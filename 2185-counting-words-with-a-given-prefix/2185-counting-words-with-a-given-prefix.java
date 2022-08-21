class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String strings : words){
            if(strings.startsWith(pref))
                count++;
        }
        
        return count; 
    }
}