class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i]%2 ==0){
                nums[i] = 0 ; 
            }
            else{
                nums[i] = 1; 
            }
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , 1);
        int ans = 0 ; 
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ;i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                ans+= map.get(sum - k);
            }
            map.put(sum , map.getOrDefault(sum , 0) + 1);
        }
        return ans;
    }
}
