class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> ret = new ArrayList<>();
        for(int[] i : items1){
            map.put(i[0],i[1]);
        }
        
        for(int[] i : items2){
            if(map.containsKey(i[0])){
                map.put(i[0],map.get(i[0]) + i[1]);
            }else{
                map.put(i[0],i[1]);
            }
        }
        
        for(int i : map.keySet()){
            ArrayList<Integer> set = new ArrayList<>();
            set.add(i);
            set.add(map.get(i));
            ret.add(set);
        }
        
        Collections.sort(ret, (a,b) -> a.get(0) - b.get(0));
        return ret;
    }
}