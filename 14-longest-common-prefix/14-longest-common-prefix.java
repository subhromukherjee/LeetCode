class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        // Can use startsWith function also
        while(index<first.length() && first.charAt(index)==last.charAt(index))
            index++;
        return index==0 ? "":first.substring(0,index);
    }
}