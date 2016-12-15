package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySum {
	public static ArrayList<Integer> subarraySum(int[] nums) {
		// write your code here
		int len = nums.length;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += nums[i];
			if (map.containsKey(sum)) {
				ans.add(map.get(sum) + 1);
				ans.add(i);
				return ans;
			}
			map.put(sum, i);
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, -5, 3};
		System.out.println(subarraySum(nums));
	}
}
