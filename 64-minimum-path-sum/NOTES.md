// recursive
if (grid == null || grid.length == 0) return 0;
​
int m = grid.length;
int n = grid[0].length;
return getPath(grid, m-1, n-1);
}
private int getPath(int[][] grid , int i , int j){
if(i == 0 && j == 0) return grid[0][0];
if(i<0 || j<0) return (int)Math.pow(10,9);;
int down = grid[i][j] + getPath(grid, i-1 , j);
int right = grid[i][j] + getPath(grid, i, j-1);
return Math.min(down, right);