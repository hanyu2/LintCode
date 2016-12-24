package DP;

public class MaxProduct {
	public static int maxProduct(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return 0;
        }
        int maxSoFar = nums[0];
        int maxHere = nums[0];
        int minSoFar = Integer.MAX_VALUE;
        int minHere = nums[0];
        for(int i = 1; i < nums.length; i++){
        	    int maxTemp = maxHere;
            maxHere = Math.max(nums[i], Math.max(maxHere * nums[i], minHere * nums[i]));
            minHere = Math.min(nums[i], Math.min(maxTemp * nums[i], minHere * nums[i]));
            maxSoFar = Math.max(maxSoFar, maxHere);
            minSoFar = Math.min(minSoFar, minHere);
        }
        return maxSoFar;
    }
	public static void main(String[] args) {
		int[] nums = {1,0,-1,2,3,-5,-2};
		System.out.println(maxProduct(nums));
	}
}
