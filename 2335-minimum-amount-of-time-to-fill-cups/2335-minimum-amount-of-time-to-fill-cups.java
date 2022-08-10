class Solution {

    public int fillCups(int[] amount) {
       int mx = 0, sum = 0;
        for(int a: amount) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
}


