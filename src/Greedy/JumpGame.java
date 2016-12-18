package Greedy;

public class JumpGame {
	public boolean canJump(int[] A) {
        // wirte your code here
        int max = A[0];
        for(int i = 1; i < max; i++){
            if(i >= A.length - 1){
                break;
            }
            max = Math.max(max, A[i] + i);
        }
        return max >= A.length - 1;
    }
}
