import java.util.Stack;

class Solution {
    boolean solution(String s) {
		Stack<String> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==')'){
				if(stack.isEmpty()) return false;
                stack.pop();
                // if(!stack.pop().equals("(")) return false;
			} else {
                stack.push("(");
            }
		}
        if(stack.isEmpty()) return true;
		return false;
	}
}