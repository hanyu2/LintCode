package Greedy;

public class JumpGame2 {
	public int jump(int[] A) {
        // write your code here
        int fur = A[0];
        int max = 0;
        int step = 1;
        for(int i = 1; i <= fur; i++){
            if(i >= A.length - 1){
                break;
            }
            max = Math.max(max, A[i] + i);
            if(i == fur){
                fur = max;
                step++;
            }
        }
        return step;
    }
}
