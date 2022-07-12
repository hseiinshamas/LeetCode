class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) if (isDivide(i)) list.add(i);
        return list;
    }

   private static boolean isDivide(int num) {
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            if (rem == 0 || temp % rem != 0) return false;
            num /= 10;
        }
        return true;
    }
}
