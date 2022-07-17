
   class StringComparator implements Comparator<String> {
    public int compare(String a, String b) {
        if (a.length() == b.length()) {
            return b.compareTo(a);
        } else {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        }
    }
}

public class Solution {
    public String largestNumber(int[] num) {
        StringBuffer sbuf = new StringBuffer();
        ArrayList<String> numstrings = new ArrayList<String>(num.length);
        
        for (int i : num) numstrings.add(String.valueOf(i));
        Collections.sort(numstrings,  new StringComparator());
        
        for (String s : numstrings) sbuf.append(s);
        
        String res = sbuf.toString();
        if (res.length() > 0 && res.charAt(0) == '0') return "0";
        
        return res;
    }
}