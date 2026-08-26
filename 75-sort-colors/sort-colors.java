class Solution {
    public void sortColors(int[] nums) {
        for(int i=1;i<nums.length;i++){  
            int goal=nums[i];  
            int j=i-1;  
            while(j>=0 && nums[j]>goal){  
                nums[j+1]=nums[j]; 
                j--; 
            }
            nums[j+1]=goal;  
        }
    

        
    }
}