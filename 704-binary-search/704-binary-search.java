class Solution {
    public int search(int[] nums, int target) {
    
       if(nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length-1;
        return binarySearch(nums, target, start, end);
    }
    
    private int binarySearch(int[] nums, int target, int start, int end){
        if(start > end) return -1;
        int mid = start+(end-start)/2;
         if(nums[mid] == target) return mid;
        if(target < nums[mid]){
                return binarySearch(nums, target, start, mid-1);
        } else {
                return binarySearch(nums, target, mid+1, end);
        }
    }
}