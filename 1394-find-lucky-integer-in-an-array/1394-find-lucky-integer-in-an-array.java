class Solution {

    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
           
            else map.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == entry.getKey() && entry.getValue() > max)
                max = entry.getValue();
        }
        
        if(max == 0) return -1; 
       
        return max;
        
        
    }
}
