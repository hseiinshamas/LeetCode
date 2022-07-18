class Solution {

    public List<Integer> partitionLabels(String s) {
        List<Integer> partitionLengths = new ArrayList<>();
        int[] lastOccurrence = new int[26];

        //standard noting of lastOccurance of lowercase alph in a String.
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        //starting from first letter
        int i = 0;
        while (i < s.length()) {
            //lastOccurrence of first letter
            int end = lastOccurrence[s.charAt(i) - 'a'];
            //edge case(start==end that means only 1 char)
            if (i == end) {
                partitionLengths.add(1);
                i++;
            } else {
                //start j from next to i
                int j = i + 1;
                while (j != end) { //loop until we find lastindesxes of all chars in substring
                    end = Math.max(end, lastOccurrence[s.charAt(j++) - 'a']);
                }
                partitionLengths.add(j - i + 1);
                i = j + 1;
            }
        }
        return partitionLengths;
    }
}
