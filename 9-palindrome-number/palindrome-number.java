class Solution {
    public boolean isPalindrome(int x) {
        String y=String.valueOf(x);
        String z="";
        
        if (x<0){
            return false;
        }
        for(int i=y.length()-1;i>=0;i--){
            z= z + y.charAt(i);
        }
       
        return y.equals(z);
        
    }
}