class Solution {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            res[i] = countEach(i);
        }
        
        return res;
    }

    private int countEach(int n) {
        int res = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                res++;
            }

            n /= 2;
        }

        return res;
    }
}
