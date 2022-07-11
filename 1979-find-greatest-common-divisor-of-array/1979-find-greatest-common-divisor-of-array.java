class Solution {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int gcd = 1;

        for (int i = 1; i <= max && i <= min; i++) {
            if (max % i == 0 && min % i == 0) gcd = i;
        }
        return gcd;
    }
}
