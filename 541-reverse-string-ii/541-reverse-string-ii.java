class Solution {
    public String reverseStr(String s, int k) {
       char charArr[] = s.toCharArray();
        for(int i = 0;i<s.length();i=i+(2*k)){
            
            int start = i;
            int end = start+k-1;
            
            if(end>s.length()-1){
                end=s.length()-1;
            }
            while(start<=end){
                char temp = charArr[start];
                charArr[start++] = charArr[end];
                charArr[end--] = temp;
            }
            
        }
        s = String.copyValueOf(charArr);
        return s;
    }
}