class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        String current = "";
        
        for(int i=0;i<s.length();i++){
            String curr = String.valueOf(s.charAt(i));
            // If string already contains the character
            // Then substring after repeating character
            if(current.contains(curr))
                current = current.substring(current.indexOf(curr)+1); 
            current = current+curr;
            res = Math.max(res, current.length());
        }
        
        return res;
        // T.C O(n)
    }
}
