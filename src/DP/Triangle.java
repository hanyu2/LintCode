package DP;

public class Triangle {
	public static int minimumTotal(int[][] triangle) {
        // write your code here
        if(triangle == null || triangle.length == 0){
            return 0;
        }
        int m = triangle.length;
        int[] dp = new int[m];
        dp[0] = triangle[0][0];
        for(int i = 1; i < m; i++){
            int[] dp2 = new int[i + 1];
            for(int j = 0; j < i + 1; j++){
                if(j == 0){
                    dp2[j] = triangle[i][j] + dp[j];
                }else if(j == i){
                    dp2[j] = triangle[i][j] + dp[j - 1];
                }else{
                    dp2[j] = triangle[i][j] + Math.min(dp[j - 1], dp[j]);
                }
            }
            dp = dp2;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < dp.length; i++){
            min = Math.min(min, dp[i]);
        }
        return min;
    }
	public static void main(String[] args) {
		int[][] triangle = {{1},{2, 3}};
		System.out.println(minimumTotal(triangle));
	}
}
