class Solution {
    public int reverse(int x) {
        
        int ans=0;
        int y=x;
        if(x<0){
            x=x*-1;
            
        }
            
        while(x>0){
            if(ans<Integer.MIN_VALUE/10 || ans>Integer.MAX_VALUE/10){
                return 0;
            }
            ans=ans*10+x%10;
            x=x/10;
        }
        if(y<0)
        return ans*-1;
        else
            return ans;
    }
}