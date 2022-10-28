class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
       HashMap<String, List<String>> mp = new HashMap<>();
        
       
        
        for(String strings : strs){
            char[] characters = strings.toCharArray();
            Arrays.sort(characters); 
            String current = new String(characters);
            
            if(!mp.containsKey(current)){
                mp.put(current, new ArrayList<>());
            }
            
            mp.get(current).add(strings);// add string to any list within the map value; 
        }
        list.addAll(mp.values());
        return list;
     
        
      
    }
}