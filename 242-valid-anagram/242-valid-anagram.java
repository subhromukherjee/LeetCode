class Solution {
    public boolean isAnagram(String s, String t) {
//         char[] s1 = s.toCharArray();
//         Arrays.sort(s1);
        
//         char[] s2 = t.toCharArray();
//         Arrays.sort(s2);
//         if(Arrays.equals(s1, s2))
//             return true;
//         return false;
        
//         T.C. - O(nLogn)
        if(s.length()!=t.length())
            return false;
        
        int n = 256;
        int[] count = new int[n];
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        for(int i=0;i<str1.length;i++){
            count[str1[i]]++;
            count[str2[i]]--;
        }
         // For each character in input strings,
        // increment count in the corresponding
        // count array
        for(int i=0;i<n;i++){
            // non zero value means different element
            if(count[i]!=0)
                return false;
        }
        return true;
        // T.C. : O(n)
    }
}