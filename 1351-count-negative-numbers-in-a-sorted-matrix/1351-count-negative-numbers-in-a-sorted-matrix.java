class Solution {
    public int countNegatives(int[][] grid) {
        int count_Negatives = 0; 
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(grid[i][j] < 0) count_Negatives++;
            }
        }
        
        return count_Negatives;
    }
}