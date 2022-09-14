class Solution {
public int numDistinct(String s, String t) {
return getNum(s, t, s.length() - 1, t.length() - 1);
}
​
private int getNum(String s, String t, int i, int j) {
// base case
if (j < 0) return 1;
if (i < 0) return 0;
​
if (s.charAt(i) == t.charAt(j))
return getNum(s, t, i - 1, j - 1) + getNum(s, t, i - 1, j);
else return getNum(s, t, i - 1, j);
}
}
​