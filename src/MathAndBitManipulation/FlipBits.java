package MathAndBitManipulation;

public class FlipBits {
	public static int bitSwapRequired(int a, int b) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            count += (a & 1)^(b & 1);
            a >>= 1;
            b >>= 1;
        }
        return count;
    }
}
