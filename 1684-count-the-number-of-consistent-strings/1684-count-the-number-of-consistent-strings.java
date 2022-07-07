class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       
         HashSet<Character>set = new HashSet<>(); 
        int count = 0 ; 
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        
        for(String string : words){
            boolean match = true; 
            
            for(char ch : string.toCharArray()){
                if(!set.contains(ch)){
                    match =false;
                    break;
                }
            }
            if(match)
                count++;
                
        }
        return count; 
    } // a , b , c set 
}