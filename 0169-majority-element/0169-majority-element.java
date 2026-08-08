class Solution {
    public int majorityElement(int[] nums) {
        int p=nums[0];
        
        for(int i=0;i<nums.length;i++){
            int count=1;
            int k=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(k==nums[j]){
                    count++;
                    if(count>(nums.length/2)){
                        
                        return k;
                    }
                }
            }
        }
    return p;
        
    }
}