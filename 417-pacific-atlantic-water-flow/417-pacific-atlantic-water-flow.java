class Solution {
       static int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans=new ArrayList<>();
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pac=new boolean[heights.length][heights[0].length];
        boolean[][] atl=new boolean[heights.length][heights[0].length];
        
        for(int i=0;i<n;i++){
            dfs(heights,0,i,Integer.MIN_VALUE,pac);
            dfs(heights,m-1,i,Integer.MIN_VALUE,atl);
        }
        for(int j=0;j<m;j++){
            dfs(heights,j,0,Integer.MIN_VALUE,pac);
            dfs(heights,j,n-1,Integer.MIN_VALUE,atl);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(pac[i][j] && atl[i][j]){
                   List<Integer> l=new ArrayList<>();
                   l.add(i);
                   l.add(j);
                   ans.add(l);
               }
            }
        }
        return ans;
    }
    public static void dfs(int[][] heights,int i, int j,int prev, boolean[][] arr){
        if(i<0 || j<0 || i>=heights.length || j>=heights[0].length || arr[i][j]==true || heights[i][j]<prev)return;
        
        arr[i][j]=true;
        for(int k=0;k<4;k++){
            int x=i+dir[k][0];
            int y=j+dir[k][1];
            
            dfs(heights,x,y,heights[i][j],arr);
        }
    }
}