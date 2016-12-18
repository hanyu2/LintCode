package Greedy;

public class MajorityBumber2 {
	public int majorityNumber(ArrayList<Integer> nums) {
		// write your code
		if (nums == null || nums.size() == 0) {
			return -1;
		}
		int x1 = 0;
		int x2 = 0;
		int c1 = 0;
		int c2 = 0;
		for (int n : nums) {
			if (n == x1) {
				c1++;
			} else if (n == x2) {
				c2++;
			} else if (c1 == 0) {
				x1 = n;
				c1 = 1;
			} else if (c2 == 0) {
				x2 = n;
				c2 = 1;
			} else {
				c1--;
				c2--;
			}
		}
		c1 = 0;
		c2 = 0;
		for (int n : nums) {
			if (n == x1) {
				c1++;
			}
			if (n == x2) {
				c2++;
			}
		}
		return c1 > c2 ? x1 : x2;
	}
}
