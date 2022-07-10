class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
      Set<Integer> set = new HashSet();
        Set<Integer> result =  new HashSet();
        for(int i : nums1) //add all number on nums1 to set
            set.add(i);
        for(int i : nums2) // findout if there any intersection with nums2
            if(set.contains(i)) result.add(i);
        for(int i : nums2) //lately add all numbers from nums2 to set.
            set.add(i);
        for(int i : nums3) // check if there is intersection with again for nums3
            if(set.contains(i)) result.add(i);
        return new ArrayList(result);
    
    }
}