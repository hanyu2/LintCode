package BinarySearch;

public class SearchA2DMatrix2 {
	public int searchMatrix(int[][] matrix, int target) {
		// write your code here
		if (matrix == null || matrix.length == 0) {
			return 0;
		}
		int i = 0;
		int j = matrix[0].length - 1;
		int count = 0;
		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] == target) {
				count++;
				i++;
			} else if (matrix[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return count;
	}
}
