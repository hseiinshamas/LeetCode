
import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < s.length(); i++) {
			char first = s.charAt(i);
			if (first == '(' || first == '{' || first == '[') {
				stack.push(first);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char c;

			switch (first) {

			case ')':
				c = stack.pop();
				if (c == '[' || c == '{')
					return false;
				break;

			case '}':
				c = stack.pop();
				if (c == '[' || c == '(')
					return false;
				break;

			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;

			}

		}
		return stack.isEmpty(); // if empty that means that there are matches.

        
    }
}