public class Solution {
    public string LongestCommonPrefix(string[] strs) { 
        string com = strs[0];
        for(int i = 1; i < strs.Length; i++){
            string sb = "";
            for(int j = 0; j < Math.Min(com.Length, strs[i].Length); j++){
                if(com[j] == strs[i][j]){
                    sb += com[j];
                }
                else{
                    break;
                }
            }

            if(com.Length > sb.Length){
                com = sb;
            }
        }

        return(com);
    }
}
