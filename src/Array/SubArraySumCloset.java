package Array;

import java.util.Arrays;
import java.util.Comparator;

class Pair {
	int sum;
	int index;

	public Pair(int sum, int index) {
		this.sum = sum;
		this.index = index;
	}
}

public class SubArraySumCloset {
	public static int[] subarraySumClosest(int[] nums) {
		int[] res = new int[2];
		if (nums == null) {
			return res;
		}
		Pair[] sum = new Pair[nums.length + 1];
		sum[0] = new Pair(0, 0);
		int pre = 0;
		for (int i = 1; i <= nums.length; i++) {
			pre += nums[i - 1];
			sum[i] = new Pair(pre, i);
		}
		Arrays.sort(sum, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p1.sum - p2.sum;
			}
		});
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= nums.length; i++) {
			if (sum[i].sum - sum[i - 1].sum < min) {
				min = sum[i].sum - sum[i - 1].sum;
				res[0] = sum[i].index - 1;
				res[1] = sum[i - 1].index - 1;
				Arrays.sort(res);
				res[0] += 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { -3, 1, 1, -3, 5 };
		System.out.println(subarraySumClosest(nums)[0] + ", " + subarraySumClosest(nums)[1]);
	}

}
