class Solution {

    public int subtractProductAndSum(int n) {
        int remainder;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            remainder = n % 10;
            sum += remainder;
            product *= remainder;
            n = n / 10;
        }

        return product - sum;
    }
}
