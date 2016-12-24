package DP;

public class UniquePaths2 {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		// write your code here
        if(obstacleGrid == null || obstacleGrid.length == 0){
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for(int i = 1; i < n; i++){
            if(obstacleGrid[0][i] == 0){
            		dp[i] = dp[i - 1];
            }else{
                break;
            }
        }
        for(int i = 1; i < m; i++){
            if(obstacleGrid[i][0] != 0){
                dp[0] = 0;
            }
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 0){
                    dp[j] += dp[j - 1];
                }else{
                    dp[j] = 0;
                }
            }
        }
        return dp[n - 1];
    }
	public static void main(String[] args) {
		int[][] grid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
		System.out.println(uniquePathsWithObstacles(grid));
	}
}
