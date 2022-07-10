class Solution {

    public int[] sortedSquares(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[j++]=nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
