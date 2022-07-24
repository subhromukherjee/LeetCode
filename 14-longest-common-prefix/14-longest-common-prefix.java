class Solution {
    public String longestCommonPrefix(String[] strs) {
        // int index = 0;
        // Arrays.sort(strs);
        // String first = strs[0];
        // String last = strs[strs.length-1];
        // // Can use startsWith function also
        // while(index<first.length() && first.charAt(index)==last.charAt(index))
        //     index++;
        // return index==0 ? "":first.substring(0,index);
        // T.C. nLogn cz of sorting
        
        String prefix = strs[0];
         /*
            * We check if the prefix is at the beginning of the currentWord, 
                if it is not the "indexOf" will return a "-1"
            * if it return a "-1" then we reduce the last character of the prefix by one position and that                  will be our new prefix.
            * We will iterate over this until the indexOf returns a "0" which means we have a match, or we                  have removed all the characters of the prefix string, 
                which will be a "" (empty string)*/
        for(String s:strs){
            while(s.indexOf(prefix)!=0)
                prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }
}