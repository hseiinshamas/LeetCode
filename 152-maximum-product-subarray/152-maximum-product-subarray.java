class Solution {

    public int maxProduct(int[] nums) {
        int localProduct = 1;
		int maxProduct=nums[0];
		for(int  i = 0; i < nums.length; i++){
			localProduct *= nums[i];
			if(maxProduct < localProduct){
				maxProduct = localProduct;
			}
			if(localProduct==0)
				localProduct = 1;
		}
		localProduct = 1;
		for(int i = nums.length-1; i>=0;i--){
			localProduct *= nums[i];
			if(maxProduct<localProduct)
				maxProduct = localProduct;
			if(localProduct == 0)
				localProduct =1;
		}
		return maxProduct;
    }
}
