class Solution {

    public int findPeakElement(int[] nums) {
        return search(nums, 0 , nums.length - 1);
    }

    private int search(int[] nums, int left, int right) {
        if (left == right) return left;
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[mid + 1]) return search(nums, left, mid);
        return search(nums, mid + 1, right);
    }
}
