class Solution {
    public String largestNumber(int[] nums) {
        List<String> str = new ArrayList<>();
        
        // valueOf converts data types into string
        for(int i:nums)
            str.add(String.valueOf(i));
        
        // Custom comparator
        Collections.sort(str, (a,b) -> (b+a).compareTo(a+b));
        
        // To pass test case
        // Input 00 -> Output 0
        if(str.get(0).equals("0"))  return "0";
        StringBuilder res = new StringBuilder();
        for(String s:str)
            res.append(s);
        return res.toString();
    }
}