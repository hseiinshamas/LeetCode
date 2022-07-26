class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] output = new int[2];

        if (nums.length == 0) {
            output[0] = -1;
            output[1] = -1;
            return output;
        }

        output[0] = search(nums, target);
        output[1] = searchFinal(nums, target);
        return output;
    }

    private int search(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    private int searchFinal(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
