class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] temp=new int[m+n];
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                temp[k] = nums1[i];
                k++;
                i++;
            }
            else{
                temp[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(j<n){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        while(i<m){
            temp[k]=nums1[i];
            i++;
            k++;
        }
        for(int len=0;len<n+m;len++){
            nums1[len]=temp[len];
        }



















        // int i=m-1;
        // int j=n-1;
        // int k=m+n-1;
        // while(i>=0 && j>=0){
        //     if(nums1[i]<nums2[j]){
        //         nums1[k]=nums2[j];
        //         j--;
        //         k--;
        //     }
        //     else{
        //         nums1[k]=nums1[i];
        //         i--;
        //         k--;
        //     }

        // }
        // while(i>=0){
        //     nums1[k]=nums1[i];
        //     k--;
        //     i--;
        // }
        // while(j>=0){
        //     nums1[k]=nums2[j];
        //     k--;
        //     j--;
        // }
    }
}