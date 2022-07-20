class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>(); 
        backtrack(nums , new ArrayList() , list);
            return list ; 
        
        
    }
    public void backtrack(int[] nums , List<Integer> list , List<List<Integer>> result)  {
       
        if(nums.length == list.size()) {
            result.add(new ArrayList(list));
        }
        else{
           
            for(int i = 0 ; i < nums.length; i++){
                if(list.contains(nums[i])) continue; 
                list.add(nums[i]);
                backtrack(nums , list , result); 
                list.remove(list.size() - 1 );
            }
        }
    }
}