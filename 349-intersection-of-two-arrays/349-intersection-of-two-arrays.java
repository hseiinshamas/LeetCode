class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer>set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1) set.add(i);
        for(int j = 0 ; j < nums2.length ;j++) { 
            if(set.contains(nums2[j])) {
            list.add(nums2[j]);
           set.remove(nums2[j]);
            }
        }
        
        int[]res = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++) { 
            res[i] = list.get(i);
        }
        return res;
        
    }
}
