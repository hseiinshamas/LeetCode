class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0 ; 
      
        char [] arr = jewels.toCharArray();
        
        char [] st = stones.toCharArray(); 
        
        HashSet<Character> set = new HashSet<>(); 
        
        for(char c : arr){
            set.add(c); 
        }
        
      
        for(int i = 0 ; i<st.length ;i++){
            if(set.contains(st[i])){
                count++; 
            }
        }
        
        return count; 
    }
}