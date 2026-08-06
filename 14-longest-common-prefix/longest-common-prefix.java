class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String first = strs[0];    // for first word    
        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);  // first word's first character
        
            for (int j = 1; j < strs.length; j++) {  // remaining word of string array
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return first.substring(0,i);

                }
            }
        }
    return first;
    }
}