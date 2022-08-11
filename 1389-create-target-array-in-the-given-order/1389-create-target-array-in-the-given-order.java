class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> list = new LinkedList<>();
       
        for (int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);
        
        int[] target = new int[nums.length];
       
        int i = 0;
        for (int val : list) target[i++] = val;
        
        return target;
    }
}

