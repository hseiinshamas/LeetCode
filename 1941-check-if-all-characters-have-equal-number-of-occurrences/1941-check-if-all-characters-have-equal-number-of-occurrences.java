class Solution {
    public boolean areOccurrencesEqual(String s) {
       HashMap<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);// get the frequency

		int n = map.get(s.charAt(0));
		for (int i = 0; i < s.length(); i++) {
			if(n!=map.get(s.charAt(i)))
				return false;
		}
		
		return true; 
    }
}