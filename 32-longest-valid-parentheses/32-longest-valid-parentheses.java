class Solution {
    public int longestValidParentheses(String s) {
        int len = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push(i);
            else{
                stack.pop();
                if(stack.empty())
                    stack.push(i);
                else
                    len = Math.max(len, i - stack.peek());
            }
        }
        return len;
        
    }
}