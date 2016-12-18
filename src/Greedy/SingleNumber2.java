package Greedy;

public class SingleNumber2 {
	public int singleNumberII(int[] A) {
        // write your code here
        if(A == null || A.length == 0){
            return -1;
        }
        int res = 0;
        for(int i = 0; i < 32; i++){
            int x = 0;
            for(int j = 0; j < A.length; j++){
                x += (A[j] >> i) & 1;
            }
            res |= (x % 3) << i;
        }
        return res;
    }
}
