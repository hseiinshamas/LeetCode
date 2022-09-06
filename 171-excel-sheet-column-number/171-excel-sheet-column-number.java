class Solution {

    public int titleToNumber(String s) {
        int res = 0;
        for (char c : s.toCharArray()) {
            int d = c - 'A' + 1;
            res = res * 26 + d;
        }

        return res;
    }
}
