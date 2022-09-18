class Solution {
   public int trap(int[] height) {
  int n = height.length;
  int lo = 0, hi = n - 1;
  int leftMax = 0, rightMax = 0;
  int water = 0;
  while (lo < hi) {
    // update
    if (height[lo] > leftMax)  leftMax = height[lo];
    if (height[hi] > rightMax) rightMax = height[hi];
    // compute
    if (leftMax < rightMax) { // consider the min
        water += (leftMax - height[lo]); // leftMax >= height[lo]
        ++lo;
    } else {
        water += (rightMax - height[hi]);
        --hi;
    }
  }
  
       return water;
   
   }
}