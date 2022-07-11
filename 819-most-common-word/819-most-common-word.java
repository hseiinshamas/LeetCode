class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String bannedWord : banned) {
            set.add(bannedWord);
        }

        for (String word : words) {
            if (!set.contains(word)) map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String result = "";
        int max = 0;

        for (String str : map.keySet()) {
            if (map.get(str) > max) {
                max = map.get(str);
                result = str;
            }
        }
        return result;
    }
}
