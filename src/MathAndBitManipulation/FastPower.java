package MathAndBitManipulation;

//(a * b) % c = (a % c) * (b %  c)
public class FastPower {
	public static int fastPower(int a, int b, int n) {
        if (n == 1) {
            return a % b;
        }
        if (n == 0) {
            return 1 % b;
        }
        
        long product = fastPower(a, b, n / 2);
        product = (product * product) % b;
        if (n % 2 == 1) {
            product = (product * a) % b;
        }
        return (int) product;
    }
	public static void main(String[] args) {
		System.out.println(fastPower(0, 21, 4));
	}
}
