```
class Solution {
public int longestCommonSubsequence(String text1, String text2) {
return f(text1.length()-1 , text2.length()-1, text1, text2);
}
private int f(int ind1 , int ind2 , String text1, String text2){
if(ind1 < 0 || ind2 < 0) return 0 ;
if(text1.charAt(ind1) == text2.charAt(ind2))
return 1 + f(ind1 - 1, ind2 -1 , text1 , text2);
return 0 + Math.max(f(ind1-1, ind2, text1, text2),
f(ind1, ind2-1, text1, text2));
}
}
```