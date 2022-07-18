class Solution {

    public void sortColors(int[] nums) {
        int[] output = new int[nums.length];
        int len = nums.length;
        if (len < 2) return;

        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < len; i++) {
            right[i - mid] = nums[i];
        }

        sortColors(left);
        sortColors(right);

        // merge function
        merge(nums, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int ll = left.length;
        int rr = right.length;

        while (i < ll && j < rr) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < ll) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rr) {
            array[k] = right[j];
            k++;
            j++;
        }
    }
}
