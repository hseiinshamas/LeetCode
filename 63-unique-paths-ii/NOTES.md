// recursive
public int uniquePathWithObstacles(int[][] obstacleGrid){
int m = obstacleGrid.length;
int n = obstacleGrid[0].length;
return getPath(obstacleGrid, m - 1, n - 1);
}
​
private int getPath(int[][] grid, int i, int j) {
if (i == 0 && j == 0) return 1;
if(i >= 0 && j >= 0 && grid[i][j] == 1) return 0;
if (i < 0 || j < 0) return 0;
​
int up = getPath(grid, i - 1, j);
int left = getPath(grid, i, j - 1);
​
return left + up;
}