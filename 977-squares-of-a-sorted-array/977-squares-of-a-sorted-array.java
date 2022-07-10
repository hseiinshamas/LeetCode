class Solution {
    public int[] sortedSquares(int[] nums) {
       
        int[] output  = new int[nums.length]; 
      
        int i = 0 ;
        for(int num : nums){
            output[i++] = num * num ; 
        }
      Arrays.sort(output);
        return output;
    }
}