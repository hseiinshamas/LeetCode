class Solution {
    public int findKthLargest(int[] nums, int k) {
        
     Arrays.sort(nums); // 3 2 1 ... 1 2 3 k  = 2
        return nums[nums.length - k];
            
    }
}

