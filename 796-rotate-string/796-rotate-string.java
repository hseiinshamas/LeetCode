class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length())
            return false;
        String end = s+s; 
        return end.contains(goal);
    }
}