class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        
        for(int n  : map.values()) set.add(n);

        return map.size() == set.size();
    }
} 