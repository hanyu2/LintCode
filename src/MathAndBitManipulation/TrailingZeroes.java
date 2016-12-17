package MathAndBitManipulation;

public class TrailingZeroes {
	public long trailingZeros(long n) {
		// write your code here
		long sum = 0;
		while (n != 0) {
			sum += n / 5;
			n /= 5;
		}
		return sum;
	}
}
