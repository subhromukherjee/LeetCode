// https://www.youtube.com/watch?v=eyCj_u3PoJE
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    void backtrack(List<String> res, String str, int open, int close, int max){
        // Base case
        // Used up all open and close
        if(open==max && close==max){
            res.add(str);
            return;
        }
        
        if(open<max){
            backtrack(res, str+"(", open+1, close, max);
        }
        // Once we add a '(' we will then discard it and try a ')' which can only close a valid '('
        if(close<open){
            backtrack(res, str+")", open, close+1, max);
        }
        
    }
    
    
//     boolean isValid(String s){
        
//         for(char c:s.toCharArray()){
//             if(c=='(')
//                 count++;
//             else
//                 count--;
//             if(c<0)
//                 return false;
//         }
//         if(c>0) return false;
        
//         return true;
//     }
}