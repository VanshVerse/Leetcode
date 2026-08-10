class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        String f="";
        int i=0;
        while(i<a || i<b){
            if(i<a){
               f=f + word1.charAt(i);
            }
            if(i<b){
                f=f+ word2.charAt(i);
            }
            i++;
        }
        return f;

        
    }
}