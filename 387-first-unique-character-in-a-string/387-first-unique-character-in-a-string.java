class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[256];
        
        for(char ch : s.toCharArray())
            arr[ch]++;
        
        for(char ch : s.toCharArray())
            if(arr[ch]==1)
                return s.indexOf(ch);
        return -1;
    }
}