class Solution {
    public int strStr(String haystack, String needle) {
        
        int k=needle.length();
        for(int i=0;i<haystack.length();i++){
            int j=0;
            int p=i;
            
            while(j<k){
                
                if(haystack.charAt(p)!=needle.charAt(j)){
                    break;
                }
            
                p++;
                j++;
            }
            if(j==k){
            return i;
            }
        }
        return -1;                    
    }
}