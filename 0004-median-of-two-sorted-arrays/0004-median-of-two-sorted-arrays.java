class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0;
        int i=0;
        int j=0;
        int m=nums1.length;
        int n=nums2.length;
        int l=nums1.length+nums2.length;
        int[] finals=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                finals[k]=nums1[i];
                i++;
                k++;
            }
            else{
                finals[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            finals[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            finals[k]=nums2[j];
            j++;
            k++;
        }
        int c=finals.length;
        if(c%2 == 0){
            return (finals[(c/2)-1]+finals[c/2])/2.0;
        }
        else{
            return finals[(c/2)];

        }
    
        
    }
}