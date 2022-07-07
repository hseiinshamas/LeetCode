class Solution {
    public boolean checkIfPangram(String sentence) {
      
    boolean[] mark = new boolean[26];
 
        // For indexing in mark[]
        int index = 0;
 
        // Traverse all characters
        for (int i = 0; i < sentence.length(); i++) {
            
            // If lowercase character, subtract 'a'
            // to find index.
            
            if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
                index = sentence.charAt(i) - 'a';
            
             else
                continue;
            mark[index] = true;
        
        }
 
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return false;
 
        // If all characters were present
        return true;
    }
}