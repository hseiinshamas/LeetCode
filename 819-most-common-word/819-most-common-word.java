class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] p = paragraph.split("[, ?.@!;']+");
        HashSet<String> hset = new HashSet<>();
        for (String s : banned) hset.add(s.toLowerCase());
        HashMap<String, Integer> hmap = new HashMap<>();
        int max = 0;
        String key = "";
        for (String s : p) {
            s = s.toLowerCase();
            if (!hset.contains(s)) {
                hmap.put(s, hmap.getOrDefault(s, 0) + 1);
                if (hmap.get(s) > max) {
                    max = hmap.get(s);
                    key = s;
                }
            }
        }
        return key;
    }
}
