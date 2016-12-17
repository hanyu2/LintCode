package BinarySearch;

public class FindMinimumInRotatedSortedArray2 {
	public int findMin(int[] num) {
		// write your code here
		if (num == null) {
			return 0;
		}
		int left = 0;
		int right = num.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (num[mid] < num[right]) {
				right = mid - 1;
			} else if (num[mid] > num[right]) {
				left = mid + 1;
			} else {
				right--;
			}
		}
		return num[left];
	}
}
