class Solution {
    public int[][] diagonalSort(int[][] mat) {
         int m = mat.length;
        int n = mat[0].length;
        
        for(int k = n-1; k >= 0; k--){
            List<Integer> list = new ArrayList<Integer>();
            int j = k;
            for(int i = 0; i <= m-1; i++){
                list.add(mat[i][j]);
                j++;
                if(j > n-1){
                    break;
                }
            }
            Collections.sort(list);
            int i = 0;
            j = k;
            for(Integer listItem: list){
                mat[i][j] = listItem;
                i++;
                j++;
                if(i > m-1 || j > n-1){
                    break;
                }
            }
        }
        
        for(int k = 0; k <= m-1; k++){
            List<Integer> list = new ArrayList<Integer>();
            int i = k;
            for(int j = 0; j <= n-1; j++){
                list.add(mat[i][j]);
                i++;
                if(i > m-1){
                    break;
                }
            }
            Collections.sort(list);
            i = k;
            int j = 0;
            for(Integer listItem: list){
                mat[i][j] = listItem;
                i++;
                j++;
                if(i > m-1 || j > n-1){
                    break;
                }
            }
        }
        return mat;
    }
}