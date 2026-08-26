class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]%2==0){
                    minindex=j;                   
                }                
            }
            int temp=nums[i];
            nums[i]=nums[minindex];
            nums[minindex]=temp;
        }
    return nums;    
    }
}