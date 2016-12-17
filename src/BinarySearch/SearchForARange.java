package BinarySearch;

public class SearchForARange {
	public int[] searchRange(int[] A, int target) {
		// write your code here
		int[] res = { -1, -1 };
		if (A == null || A.length == 0) {
			return res;
		}
		int left = 0;
		int right = A.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (target > A[mid]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		if (A[left] != target) {
			return res;
		}
		res[0] = left;
		right = A.length - 1;
		while (left < right) {
			int mid = (left + right + 1) / 2;
			if (target < A[mid]) {
				right = mid - 1;
			} else {
				left = mid;
			}
		}
		res[1] = right;
		return res;
	}
}
