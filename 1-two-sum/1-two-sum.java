import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int i, j;

        for (i = 0; i < nums.length; i++) {
            for (j = i+1 ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output; 
    }
}
