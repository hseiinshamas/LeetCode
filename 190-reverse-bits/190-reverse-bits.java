public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        int count = 0;

        while (count++ < 32) {
            reverse = reverse << 1;

            if (n != 0) {
                reverse = (n & 1) | reverse;

                n = n >> 1;
            }
        }
        return reverse;
    }
}
