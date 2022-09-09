// recursive
class Solution {
public int longestPalindromeSubseq(String s) {
StringBuilder sb = new StringBuilder(s);
String s2 = sb.reverse().toString();
int n = s.length();
int m = s2.length();
return getLong(s, s2, n-1, m-1);
}
private int getLong(String s1, String s2, int ind1, int ind2){
// base case
if(ind1 < 0 || ind2 < 0) return 0;
// match
if(s1.charAt(ind1) == s2.charAt(ind2))
return 1 +  getLong(s1, s2, ind1-1, ind2-1);
else return 0 + Math.max(
getLong(s1,s2, ind1-1, ind2),
getLong(s1,s2, ind1, ind2-1));
}
}