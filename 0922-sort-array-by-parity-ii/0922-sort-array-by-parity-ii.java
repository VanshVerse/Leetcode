class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2==0 && i%2==0){
                continue;
            }
            else if(nums[i]%2 !=0 && i%2 !=0){
                continue;
            }
            else{
                for(int j=i+1;j<nums.length;j++){
                    if( i%2 ==0  && nums[j]%2 ==0 ){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                    else if(i%2 !=0 && nums[j]%2 !=0){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;

                    }
                }
            }
        }
        return nums;
        
    }
}