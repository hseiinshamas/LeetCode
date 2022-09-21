class Solution {
    // the idea is we don't calculate the even sum from scratch for each query
    // instead, we calculate it at the beginning
    // since each query only updates one value, 
    // so we can adjust the even sum base on the original value and new value
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = 0, n = queries.length;
        // calculate the sum of all even numbers
        for (int x : nums) {
            if (x % 2 == 0) {
                evenSum += x;
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int val = queries[i][0], idx = queries[i][1];
            // if original nums[idx] is even, then we deduct it from evenSum
            if (nums[idx] % 2 == 0) evenSum -= nums[idx];
            // in-place update nums
            nums[idx] += val;
            // check if we need to update evenSum for the new value
            if (nums[idx] % 2 == 0) evenSum += nums[idx];
            // then we have evenSum after this query, push it to ans 
            ans[i] = evenSum;
        }
        return ans;
    }
}