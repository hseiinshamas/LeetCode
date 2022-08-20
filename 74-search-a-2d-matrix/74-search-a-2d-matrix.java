class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        return search(matrix, target);
    }

    private boolean search(int[][] matrix, int target) {
        int row = matrix.length;
        int columns = matrix[0].length;
        int start = 0;
        int end = row * columns - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mid_element = matrix[mid / columns][mid % columns];

            if (mid_element < target) {
                start = mid + 1;
            } else if (mid_element > target) {
                end = mid - 1;
            } else  {
                return true;
            }
        }
        return false;
    }
}
