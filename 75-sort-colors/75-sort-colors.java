class Solution { // merge sort

    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;

            while (j > 0 && nums[j - 1] > nums[j]) {
                int tmp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = tmp;
                j--;
            }
        }
     
    }
}
