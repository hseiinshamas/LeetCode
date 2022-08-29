class Solution {

    public String licenseKeyFormatting(String s, int k) { 
        // Replacing all - and converting all letters to uppercase
        String S1 = s.replace("-", "");
        S1 = S1.toUpperCase();

        // Making stringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S1.length(); i++) {
            sb.append(S1.charAt(i));
        }
        int len = sb.toString().length();
        // Inserting '-' from back at every K position
        for (int i = k; i < len; i = i + k) {
            sb.insert(len - i, '-');
        }
        return sb.toString();
    }
}
