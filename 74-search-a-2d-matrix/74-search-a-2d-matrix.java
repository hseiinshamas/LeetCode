class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                set.add(matrix[i][j]);
            }
        }

        for (int numbers : set) {
            if (set.contains(target)) return true;
        }
        return false;
    }
}
