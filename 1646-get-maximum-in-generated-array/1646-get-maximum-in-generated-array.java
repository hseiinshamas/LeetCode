class Solution {

    public int getMaximumGenerated(int n) {
        int max = 0;
        int[] arr = new int[n + 1];
        if (n == 0) return 0;
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) arr[i] = arr[i / 2]; else {
                int a = i / 2;
                int b = i - a;
                arr[i] = arr[a] + arr[b];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
}
