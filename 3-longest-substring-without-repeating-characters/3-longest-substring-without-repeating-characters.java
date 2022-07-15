class Solution {

    public int lengthOfLongestSubstring(String s) { // sliding window 
        HashSet<Character> set = new HashSet<>();
        int largest = 0;
        char[] arr = s.toCharArray();
        int first = 0;
        int second = 0;

        while (second < arr.length) {
            if (!set.contains(arr[second])) {
                set.add(arr[second]);
                second++;
                largest = Math.max(largest, set.size());
            } else {
                set.remove(arr[first]);
                first++;
            }
        }

        return largest;
    }
}
