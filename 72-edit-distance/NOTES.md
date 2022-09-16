class Solution {
​
public int minDistance(String word1, String word2) {
int n = word1.length();
int m = word2.length();
return getDist(word1, word2, n - 1, m - 1);
}
​
private int getDist(String s1, String s2, int i, int j) {
// base case (when the recursion is over)
if(i < 0) return j + 1;
if(j < 0) return i + 1;
// match or not match
int insert = 0, delete = 0, replace = 0;
​
if (s1.charAt(i) == s2.charAt(j)) return 0 + getDist(s1, s2, i - 1, j - 1);
else {
insert = 1 + getDist(s1, s2, i, j - 1); // insert
delete =  1 + getDist(s1, s2, i - 1, j); //delete
replace =  1 + getDist(s1, s2, i - 1, j - 1); // replace
}
return Math.min(Math.min(insert, delete), replace);
}
}
​