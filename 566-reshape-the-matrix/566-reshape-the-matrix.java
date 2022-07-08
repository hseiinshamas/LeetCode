class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int rows = mat.length; 
		int columns = mat[0].length; 
		
		if(rows * columns != (r*c)) return mat; 
		
		
		
		int[][] reshaped = new int[r][c];
		
		int rows_num=0 ; 
		int columns_num = 0; 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				reshaped[rows_num][columns_num] = mat[i][j]; 
				columns_num++; 
				if(columns_num == c) {
					columns_num = 0; 
					rows_num++; 
				}
			}
		}
        
        return reshaped; 
    }
}