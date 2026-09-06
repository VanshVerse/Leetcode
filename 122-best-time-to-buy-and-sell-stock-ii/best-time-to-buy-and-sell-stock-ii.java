class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0]; //1
        int profit=0; //4 
        int ans=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i]; 
            }
            if(prices[i]-min > profit){
                profit=profit+prices[i]-min;
                ans+=profit;
                min=prices[i];
                profit=0;
            }
        }
        return ans;
    }
}