package String;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        // write your code here
        String s = strs[0];
        for(int i = 1; i < strs.length; i++){
            String t = strs[i];
            int j = 0;
            while(j < s.length() && j < t.length()){
                if(s.charAt(j) != t.charAt(j)){
                    break;
                }  
                j++;
            }
            if(j == 0){
                return "";
            }
            s = s.substring(0, j);
        }
        return s;
    }
}
