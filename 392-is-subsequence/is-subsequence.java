class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        int count=0;
        for(int i=0;i<t.length();i++){
            if(k < s.length() && s.charAt(k)==(t.charAt(i))){
                    k++;
                    count++;
            }         
        }
        if(count==s.length()){
            return true;
        }
    return false;   
    }
}