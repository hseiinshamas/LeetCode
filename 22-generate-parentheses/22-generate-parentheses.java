class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
        if (n == 0) {
			String empty = "";
            result.add(empty);
        } 
		else {
            for (int closure = 0; closure < n; closure++)
                for (String left: generateParenthesis(closure))
                    for (String right: generateParenthesis(n - closure - 1))
                        result.add("(" + left + ")" + right);
        }
        return result;
    }
}