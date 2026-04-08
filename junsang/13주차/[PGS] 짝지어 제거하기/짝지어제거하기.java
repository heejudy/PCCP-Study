import java.util.Stack;

class Solution{
	public int solution(String s)
	{
		Stack<Character> stack = new Stack<Character>();

		char temp=0;

		stack.push(s.charAt(0));

		for(int i=1;i<s.length();i++) {
			if(stack.size()!=0) {
				temp = stack.peek();
			}
			if(temp == s.charAt(i)) {
				stack.pop();
				temp=0;
			}else{
				stack.push(s.charAt(i));
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}
}