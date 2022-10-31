class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        // except for the last row and the last col 
        
       for(int i=1;i<matrix.length;i++)  
            for(int j=1;j<matrix[i].length;j++)
                if(matrix[i][j]!=matrix[i-1][j-1]) return false;
        return true;
             
    }
}