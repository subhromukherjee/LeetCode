class Solution {
    public int minMoves(int target, int maxDoubles) {
        // Greedy
        int moves = 0;
        // Start from target and check if it is divisible by 2 if so divide and reduce the maxdoubles .
       while(target>0 && maxDoubles>0){
           if(target%2 == 0){
               target/=2;
               maxDoubles--;
           }else{
               target--;
           }
           moves++;                    
       }
        // After finishing doubles
        if(target!=1)
            moves += target-1;
        return moves;
    }

}