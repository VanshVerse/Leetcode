class Solution {
    public int findMaxConsecutiveOnes(int[] nums){
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                k++;
            }
            
            else{
                if(k>count){
                    count=k;
                    k=0;
                }
                k=0;
            }
                         
        }
        if(nums[nums.length-1] ==1){
            if(k>count){
                    count=k;
            }
        }
        

         return count;   
        
    }
}