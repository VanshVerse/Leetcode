class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        int low = 0;
        int high = nums.length - 1;

        // First occurrence
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Reset
        low = 0;
        high = nums.length - 1;

        // Last occurrence
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}





        // int left=0;
        // int right=nums.length-1;
        // while(left<=right){
        //     int mid = (left + right) / 2;

        //     if(arr[mid] == target) {
        //        // return int new []{mid,mid+1};
        //     }
        //     else if(arr[mid] < target) {
        //         left = mid + 1;
        //     }
        //     else {
        //         right = mid - 1;
        //     }
        //}
        
