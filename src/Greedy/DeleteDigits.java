package Greedy;

public class DeleteDigits {
	public static String DeleteDigits(String A, int k) {
		// write your code here
		int start = 0;
		StringBuilder sb = new StringBuilder();
		k = A.length() - k;
		char[] ch = A.toCharArray();
		while (k > 0) {
			int index = start;
			int min = ch[start] - '0';
			for (int i = start; i < A.length() - k + 1; i++) {
				int x = ch[i] - '0';
				if (x < min) {
					min = x;
					index = i;
				}
			}
			start = index + 1;
			sb.append(min);
			k--;
		}
		while (sb.length() > 0 && sb.charAt(0) == '0') {
			sb.delete(0, 1);
		}
		return sb.toString();
	}

	public String DeleteDigits2(String A, int k) {
		// write your code here
		StringBuffer sb = new StringBuffer(A);
		int i, j;
		for (i = 0; i < k; i++) {
			for (j = 0; j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1); j++) {
			}
			sb.delete(j, j + 1);
		}
		while (sb.length() > 1 && sb.charAt(0) == '0')
			sb.delete(0, 1);
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(DeleteDigits("178542", 4));
		System.out.println(DeleteDigits("87654321", 2));
	}
}
