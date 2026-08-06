class Solution {
    public int[] sortedSquares(int[] nums) {
        int []a=new int[nums.length];
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                positive.add(nums[i]*nums[i]);
            }
            else{
                negative.add(nums[i]*nums[i]);
            }
        }

        int i = negative.size() - 1; // negative ko reverse direction me traverse
        int j = 0;
        int k = 0;

        // Merge
        while (i >= 0 && j < positive.size()) {

            if (negative.get(i) <= positive.get(j)) {
                a[k] = negative.get(i);
                i--;
            } 
            else {
                a[k] = positive.get(j);
                j++;
            }

            k++;
        }

        // Remaining negative
        while (i >= 0) {
            a[k] = negative.get(i);
            i--;
            k++;
        }

        // Remaining positive
        while (j < positive.size()) {
            a[k] = positive.get(j);
            j++;
            k++;
        }

        return a;


        
    }
}