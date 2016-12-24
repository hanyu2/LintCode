package DP;

import java.util.ArrayList;

public class MinimumSubarray {
	public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        if(nums == null || nums.size() == 0){
            return 0;
        }
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for(int i : nums){
            res = Math.min(res, i);
            sum += i;
            res = Math.min(res, sum);
            sum = Math.min(0, sum);
        }
        return res;
    }
}
