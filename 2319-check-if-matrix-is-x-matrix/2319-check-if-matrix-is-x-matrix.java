class Solution {

    public boolean checkXMatrix(int[][] grid) {
        
    for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==j) // If it is diagonal 1
                {
                    if(grid[i][j]==0) // If the element inside this diagonal is zero, we will return false.
                        return false;
                }
                
                else if(i+j==grid.length-1) // If it is diagonal 2
                {
                    if(grid[i][j]==0) // If the element inside this diagonal is zero, we will return false.
                        return false;
                }
                
                else // If it is neither diagonal 1 or diagonal 2
                {
                    if(grid[i][j]!=0) // If the element inside is non-zero, we will return false.
                        return false;
                }
            }
        }
    
        return true; // Since we were able to traverse the complete matrix this means, all the conditions were satisfied so we return true
  }
}
