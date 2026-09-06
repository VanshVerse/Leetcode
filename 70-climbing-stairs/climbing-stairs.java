class Solution {
    public int climbStairs(int n) {
        int prev1=2; // 2 ki
        int prev2=1; //1 ki
        int ans=0;
        if(n==1){
            return prev2;
        }        
        if(n==2){
            return prev1;
        }
        for(int i=3;i<=n;i++){
            ans=prev1+prev2;
            prev2=prev1;
            prev1=ans;
            
        }
        
    return ans;
        
    }
}