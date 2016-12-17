package MathAndBitManipulation;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
		// write your code here
		if (m < n) {
			return uniquePaths(n, m);
		}
		int res = 1;
		for (int i = 1; i <= n - 1; i++) {
			int mul = m;
			int div = i;
			int g = gcd(mul, div);
			mul /= g;
			div /= g;
			res /= div;
			res *= mul;
			m++;
		}
		return res;
	}

	public int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
}
