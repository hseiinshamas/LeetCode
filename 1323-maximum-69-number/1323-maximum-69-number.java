class Solution {
    public int maximum69Number (int num) {
       String s = Integer.toString(num);
        char[] ch = s.toCharArray();
        for(int i=0; i< ch.length; i++) {
                if(ch[i] == '6') {
                    ch[i]='9';
                    return Integer.parseInt(String.valueOf(ch));
                }
        }
        return num;
    }
}