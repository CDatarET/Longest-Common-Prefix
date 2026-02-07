class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder com = new StringBuilder(strs[0]);
        for(int i = 1; i < strs.length; i++){
            StringBuilder sb = new StringBuilder("");
            for(int j = 0; j < Math.min(com.length(), strs[i].length()); j++){
                if(com.charAt(j) == strs[i].charAt(j)){
                    sb.append(com.charAt(j));
                }
                else{
                    break;
                }
            }

            if(com.length() > sb.length()){
                com = sb;
            }
        }

        return(com.toString());
    }
}
