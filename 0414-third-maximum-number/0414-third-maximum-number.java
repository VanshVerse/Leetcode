class Solution {
    public int thirdMax(int[] nums) {
       int k=1;
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
        if(nums[i] != nums[i-1]){
            nums[k]=nums[i];
            k++;
        }
       } 
       if(k<3){
        return nums[k-1];
       } 
    return nums[k-3]; 
    }
}