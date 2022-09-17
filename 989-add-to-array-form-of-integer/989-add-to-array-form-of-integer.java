class Solution {

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int sum = k;

        int i = num.length;
        while (--i >= 0 || sum > 0) {
            if (i >= 0) {
                sum += num[i];
            }

            res.add(sum % 10);
            sum = sum / 10;
        }

        Collections.reverse(res);
        return res;
    }
}
