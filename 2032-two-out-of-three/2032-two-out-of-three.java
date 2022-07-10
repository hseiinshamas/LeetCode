class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
          List<Integer> list = new ArrayList<>();
        
        Set<Integer>mainSet=new HashSet<>();
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        Set<Integer>set3=new HashSet<>();
        
        for (var i:nums1
             ) {
            mainSet.add(i);
        }
        
        for (var i:nums2
             ) {
            mainSet.add(i);
        }
        
        for (var i:nums3
             ) {
            mainSet.add(i);
        }

        for (var i:nums1
        ) {
            set1.add(i);
        }

        for (var i:nums2
        ) {
            set2.add(i);
        }

        for (var i:nums3
        ) {
            set3.add(i);
        }

        for (var i:mainSet
             ) {
            if(set1.contains(i)&&set2.contains(i) || 
                    set1.contains(i) && set3.contains(i) || set2.contains(i)&&set3.contains(i)){
                list.add(i);
            }
            
        }
        
        return list;

        
    }
}