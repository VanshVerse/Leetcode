class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> st=new Stack<>();
        int max=0; 
        
        for(int i=0;i<=h.length;i++){
            int current;
            if(i==h.length){
                current=0;
            }
            else{
                current=h[i];
            }
            while(!st.isEmpty() && h[st.peek()]>current){
                int height=h[st.pop()];
                int left;
                if(st.isEmpty()){
                    left=-1;
                }
                else{
                    left=st.peek();
                }
                int width=i-left-1;
                int area=width*height;
                if(area>max){
                    max=area;
                }
            }
            st.push(i);

        }
        return max;
        
    }
}