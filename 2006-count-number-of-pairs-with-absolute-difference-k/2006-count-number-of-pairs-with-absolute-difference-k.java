class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int [] list = new int[201]; 
        int res = 0;
        
        for(int  val: nums) {
            res += (val-k >= 0 ? list[val-k] : 0) + list[val+k];
            list[val]++;
        }
        return res;
        
        
    }
}