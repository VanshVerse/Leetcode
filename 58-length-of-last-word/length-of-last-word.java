class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        int i=word.length-1;
        String d=word[i];
        return d.length();
        
    }
}