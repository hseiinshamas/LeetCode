class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length() && (s+s).contains(goal));
        // s+s contains every possible shift to the left
    }
}