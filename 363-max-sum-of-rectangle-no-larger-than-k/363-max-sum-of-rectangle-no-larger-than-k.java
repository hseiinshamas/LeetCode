class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        
        int max = Integer.MIN_VALUE;
        // step 1
        for (int i = 0; i < m; i++) {
            int[] add = new int[n];
            for (int j = i; j < m; j++) {
                sum(add, matrix[j]);
                
                TreeSet<Integer> treeset = new TreeSet<>();
                max = Math.max(max, helper(add, treeset, k));
                if (max == k) {
                    return max;
                }
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
    private int helper(int[] add, TreeSet<Integer> treeset, int k) {
        treeset.add(0);
        int prefixSum = 0;
        int curMax = Integer.MIN_VALUE;
        for (int ele : add) {
            prefixSum += ele;
            Integer ceil = treeset.ceiling(prefixSum - k);
            if (ceil != null) {
                if (prefixSum - ceil == k) {
                    return k;
                } else {
                    curMax = Math.max(curMax, prefixSum - ceil);
                }
            }
            treeset.add(prefixSum);
        }
        return curMax;
    }
    private void sum(int[] add, int[] cols) {
        for (int i = 0; i < cols.length; i++){
            add[i] += cols[i];
        }
    }
}