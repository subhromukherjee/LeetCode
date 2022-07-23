class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==st.peek())
                st.pop();
            else
                st.push(s.charAt(i));
        }
        String ans = "";
        for(char c:st)
            ans += c;
        return ans;
    }
}