class Solution {
    public boolean isAnagram(String s, String t) {
         char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if (s1.length != t1.length) {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        for (int i = 0 ; i < s1.length; i++){
            if (s1[i] != t1[i])
                return false; 
        }
        return true; 
    }
}