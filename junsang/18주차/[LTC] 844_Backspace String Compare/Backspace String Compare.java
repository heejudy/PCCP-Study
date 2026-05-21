class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c != '#'){
                stack.push(c);
            } else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        Stack<Character> stack2 = new Stack<>();

        for(char c : t.toCharArray()){
            if(c != '#'){
                stack2.push(c);
            } else if(!stack2.isEmpty()){
                stack2.pop();
            }
        }

        if(stack.equals(stack2)){
            return true;
        } else {
            return false;
        }
    }
}