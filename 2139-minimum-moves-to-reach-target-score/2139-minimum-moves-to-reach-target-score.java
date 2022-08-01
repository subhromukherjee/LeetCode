class Solution {
    public int minMoves(int target, int maxDoubles) {
        // Greedy
        int moves = 0;
       while(target>0 && maxDoubles>0){
           if(target%2 == 0){
               target/=2;
               maxDoubles--;
           }else{
               target--;
           }
           moves++;
               
               
       }
        if(target!=1)
            moves += target-1;
        return moves;
    }

}