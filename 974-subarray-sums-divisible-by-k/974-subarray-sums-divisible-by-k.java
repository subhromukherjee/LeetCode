class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int ans = 0;
        int sum = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i:nums){
            sum += i; 
//             int rem = sum%k;
            
//             // if sum<0 eg -2 and k=5 then -2%5=0 
//             // but we want 3 there. 
//             // So add k to make sum becomes positive
            
//             if(rem<0)
//                 rem += k;
            
            // ---- One line for the above ---- //
            // as the sum can be negative,
            // taking modulo twice
            int rem = ((sum % k) + k) % k;
            
            if(map.containsKey(rem)){
                ans += map.get(rem);
            }
            
            map.put(rem, map.getOrDefault(rem,0)+1);
            
            
            
        }
        return ans;
    }
}