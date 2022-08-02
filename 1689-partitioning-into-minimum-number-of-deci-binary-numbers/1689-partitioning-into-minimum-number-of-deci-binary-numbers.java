class Solution {
    public int minPartitions(String n) {
       int min;
        int max = 0 ; 
        for(int i = 0 ; i < n.length(); i++) {
            min = n.charAt(i) - '0';
            max = Math.max(max , min);
        }
        return max;
    }
}