import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int dif = 0;
        for (int i = 0; i < nums.length; i++) {
            dif = target - nums[i];

            if (!map.containsKey(dif)) 
                map.put(nums[i], i); 
            else return new int[] { map.get(dif), i };
        }
        return new int[] { 0, 0 };
    }
}
