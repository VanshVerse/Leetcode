class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int k=1;
            int n=nums[i]; //345
            while(n/10 >0){
                n=n/10; //34
                k++;
            }
            if(k%2==0){
                ans++;
            }
            
        }
    return ans;   
    }
}