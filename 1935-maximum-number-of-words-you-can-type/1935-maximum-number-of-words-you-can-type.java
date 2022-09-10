class Solution {

    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) set.add(c);
        String[] words = text.split(" ");
        int count = words.length;

        for (String word : words)
            for (int i = 0; i < word.length(); i++) 
                if (set.contains(word.charAt(i))) {
                    count--;
                    break;
        }

        return count;
    }
}
