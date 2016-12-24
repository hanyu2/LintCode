package DP;

public class ClimbingStairs {
	public int climbStairs(int n) {
        // write your code here
        if(n == 0){
            return 1;
        }
        int twoStep = 1;
        int oneStep = 1;
        int step = 1;
        for(int i = 2; i <= n; i++){
            step = twoStep + oneStep;
            twoStep = oneStep;
            oneStep = step;
        }
        return step;
    }
}
