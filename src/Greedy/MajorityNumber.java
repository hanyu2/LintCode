package Greedy;

public class MajorityNumber {
	public int singleNumber(int[] A) {
		// Write your code here
		int x = 0;
		for (int n : A) {
			x ^= n;
		}
		return x;
	}
}
