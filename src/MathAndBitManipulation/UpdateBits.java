package MathAndBitManipulation;

public class UpdateBits {
	public int updateBits(int n, int m, int i, int j) {
		// write your code here
		int max = ~0; /* All 1’s */
		if (j == 31) {
			j = max;
		} else {
			j = (1 << (j + 1)) - 1;
		}
		int left = max - j;
		int right = ((1 << i) - 1);
		int mask = left | right;
		return ((n & mask) | (m << i));
	}
}
