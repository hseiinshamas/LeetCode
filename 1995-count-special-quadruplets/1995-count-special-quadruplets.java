class Solution {
    public int countQuadruplets(int[] nums) {
        // we should find 3 elements that sums up to the fourth
       int i,j,k,n=nums.length,c=0;
        for(i=0;i<n-3;i++)
        {
            for(j=i+1;j<n-2;j++)
            {
                for(k=j+1;k<n-1;k++)
                {
                    for(int m=k+1;m<n;m++)
                    {
                        if(nums[i]+nums[j]+nums[k]==nums[m])
                            c++;
                    }
                }
            }
        }
        return c;
      
    }
}