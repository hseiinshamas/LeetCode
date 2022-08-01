class Solution {
    public int maxArea(int[] height) {
       int first = 0; 
        int second = height.length - 1;
        int max = 0 ; 
        
        while(first < second){
            if(height[first]  < height[second]){
                max = Math.max(max , height[first] * (second - first));
                first++;
            }else{
                max = Math.max(max , height[second] * (second - first));
                second--;
            }
        }
        return max;
    }
}