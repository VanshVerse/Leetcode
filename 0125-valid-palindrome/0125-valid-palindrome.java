class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String k="";
        String m="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
            k = k + ch;
            }
        }
        for(int f=k.length()-1;f>=0;f--){
            m=m+k.charAt(f);
        }
        if(k.equals(m)){
            return true;
        }
    return false;
        
    }
}