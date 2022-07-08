class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        if (numRows == 0) return list;
        list.add(Arrays.asList(1));
        List<Integer> set;
        for (int i = 1; i < numRows; i++) {
            set = new ArrayList<>();
            set.add(1);
            List<Integer> prevRow = list.get(i - 1);

            for (int j = 1; j < i; j++) {
                set.add(prevRow.get(j - 1)+prevRow.get(j));
            }
            list.add(set);
            set.add(1);
        }

        return list;
    }
}
