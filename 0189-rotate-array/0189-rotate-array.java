class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1){
        return;
        }
        k = k % nums.length;

        if(k == 0){
            return;
        }
        int rig=nums.length-1;
        for(int i=0;i<nums.length/2;i++){
            int temp=nums[i];
            nums[i]=nums[rig];
            nums[rig]=temp;
            rig--;
        }
        int p=k-1;
        for(int j=0;j<k/2;j++){
            int temp=nums[j];
            nums[j]=nums[p];
            nums[p]=temp;
            p--;    
        }
        int h=nums.length-1;
        for(int a=k;a<(nums.length-k)/2 +k;a++){
            int temp=nums[a];
            nums[a]=nums[h];
            nums[h]=temp;
            h--; 
        }
        

        
    }
}