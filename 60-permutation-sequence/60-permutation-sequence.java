class Solution {
    public String getPermutation(int n, int k) {
         int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n);
        String res = "";
        k = k - 1; // since we're taking it as 0 indexed
        while (true) {
            // keep looping till the list is empty
            res = res + numbers.get(k / fact);
            numbers.remove(k / fact); // to get a new array
            if (numbers.size() == 0) {
                break;
            }

            k = k % fact; // to get the next value. 
            fact = fact / numbers.size(); // reduce the factorial every step.
        }
        return res;
    }
}