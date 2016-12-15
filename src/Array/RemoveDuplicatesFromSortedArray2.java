package Array;

public class RemoveDuplicatesFromSortedArray2 {
	public int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}
		if (nums.length <= 2) {
			return nums.length;
		}
		// write your code here
		int len = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] == nums[len - 1] && nums[i] == nums[len - 2]) {
				continue;
			} else {
				nums[len++] = nums[i];
			}
		}
		return len;
	}
}
