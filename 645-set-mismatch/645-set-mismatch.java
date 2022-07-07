class Solution {
    public int[] findErrorNums(int[] nums) {
      
        /*BitSet bs = new BitSet(nums.length+1);
   
        int a=0;
    
        for(int i:nums){
          if(bs.get(i)) a=i;
          bs.set(i);            
    }
    return new int[]{a,bs.nextClearBit(1)};
        
        */
      int[] arr = new int[nums.length+1];  
      int a=0,b=arr.length;       
      for(int i: nums) arr[i]++;
        
      for(int j=1;j<arr.length;j++){
          if(arr[j]==2) a=j;
          if(arr[j]==0) b=j;            
      }
      return new int[]{a,b};
        
    }
}
