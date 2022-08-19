class Solution {

    private int digitSum(int n) {
        if (n == 0) return 0;
        return n % 10 + digitSum(n / 10);
    }

    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (digitSum(i) % 2 == 0) count++;
        }
        return count;
    }
}
