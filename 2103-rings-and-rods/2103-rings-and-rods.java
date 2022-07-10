class Solution {
    public int countPoints(String rings) {
HashMap<Integer, Set<Character>> map = new HashMap<>();
		int res = 0;

		for (int i = 1; i < rings.length(); i = i + 2) {
			int a = rings.charAt(i) - '0';
			char c = rings.charAt(i - 1);

			if (map.containsKey(a)) {
				Set<Character> s = map.get(a);
				s.add(c);
				map.put(a, s);
			} else {
				Set<Character> s = new HashSet<>();
				s.add(c);
				map.put(a, s);
			}
		}

		for (Set<Character> set : map.values()) {
			if (set.size() == 3)
				res++;
		}

		return res;
        
    }
}   



    