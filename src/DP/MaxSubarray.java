package DP;

public class MaxSubarray {
	public int maxSubArray(int[] nums) {
        // write your code
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            sum = Math.max(0, sum);
        }
        return max;
    }
}
