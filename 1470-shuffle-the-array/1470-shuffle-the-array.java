class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[2*n];
        
        int l=1;
        int p=n;
        a[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i%2!=0){
                a[i]=nums[p];
                p++;
            }
            else{
                a[i]=nums[l];
                l++;
            }
      
        }
        return a;
        
    }
}