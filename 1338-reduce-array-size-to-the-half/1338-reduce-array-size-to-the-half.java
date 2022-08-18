class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0 )+1);    // element - > freq
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));   // arranging by freq
        pq.addAll(map.entrySet());
        
        int size = 0, res = 0;
        
        while(true){
           size = size + pq.poll().getValue();
            res++;
            
            if(size >= n/2)
                break;                                                     
        }
         return res;                                                                   
    }
}