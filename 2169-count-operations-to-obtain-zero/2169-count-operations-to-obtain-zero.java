class Solution {
    public int countOperations(int num1, int num2) {
        // int count=0;
        // while(num1 != 0 && num2!=0){
        //     if(num1>=num2)
        //         num1 -= num2;
        //     else
        //         num2 -= num1;
        //     count++;
        // }
        // return count;
         int cnt = 0;
        while (Math.min(num1, num2) > 0) {
            if (num1 < num2) {
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
            }
            cnt += num1 / num2;
            num1 %= num2;
        }
        return cnt;
        // Euclidean algorithm
//          Locate the smaller and the bigger from num1 and num2;
//          bigger / smaller is the number of operations we need to accumulate;
//          bigger % smaller is the new value of the bigger;
//          repeat till one becomes 0.
    }
}