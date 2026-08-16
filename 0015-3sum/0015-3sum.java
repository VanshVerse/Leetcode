// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         List<Integer> temp = new ArrayList<>();
//                         int a=nums[i];
//                         int b=nums[j];
//                         int c=nums[k];
//                         if(a > b){
//                             int temps = a;
//                             a = b;
//                             b = temps;
//                         }
                        
//                         if(a > c){
//                             int temps = a;
//                             a = c;
//                             c = temps;
//                         }
//                         if(b > c){
//                             int temps = b;
//                             b = c;
//                             c = temps;
//                         }
//                         temp.add(a);
//                         temp.add(b);
//                         temp.add(c);
//                         if(!result.contains(temp)){
//                             result.add(temp);
//                         }                                                                      
//                     }
//                 }
//             }
//         }
//         return result ;
        
//     }
// }







class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            // duplicate i skip
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {

                    result.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    // duplicate left values skip
                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // duplicate right values skip
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                else if(sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return result;
    }
}