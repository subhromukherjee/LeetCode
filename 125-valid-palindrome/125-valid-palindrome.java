class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0, j= s.length()-1;
        while(i<j){
            while(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                if(i>=s.length())
                    break;
            }
            while(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                if(j<0)
                    break;
            }
            if(j<0 || i>j || i>=s.length()){
                break;
            }
            if(s.charAt(i)!=s.charAt(j))
                return false;
            else{
                i++;j--;
            }
        }
        return true;
    }
}