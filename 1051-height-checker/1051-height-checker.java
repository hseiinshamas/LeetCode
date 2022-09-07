class Solution {
    public int heightChecker(int[] heights) {
        int i = 0;
        int count =0;
        int[] expected = new int[heights.length];
        for(int height : heights) expected[i++] = height;
        Arrays.sort(expected);
        
        for(int j = 0; j < heights.length; j++){
            if(heights[j] != expected[j]) count++;
        }
        
        return count;
    }
}

