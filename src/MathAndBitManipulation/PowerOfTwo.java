package MathAndBitManipulation;

public class PowerOfTwo {
	public boolean checkPowerOf2(int n) {
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
