package String;

public class LongestCommonSubstring {
	public static int longestCommonSubstring(String A, String B) {
        // write your code here
        if(A == null || B == null || A.length() == 0 || B.length() == 0){
            return 0;
        }
        int a = A.length();
        int b = B.length();
        int max = 0;
        int[][]dp = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                char x = A.charAt(i);
                char y = B.charAt(j);
                if(x == y){
                		if(i == 0 || j == 0){
                			dp[i][j] = 1;
                		}else{
                			dp[i][j] = dp[i - 1][j - 1] + 1;
                		}
                }else{
                		dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
	public static void main(String[] args) {
		System.out.println(longestCommonSubstring("www.lintcode.com code", "www.ninechapter.com code"));
	}
}
