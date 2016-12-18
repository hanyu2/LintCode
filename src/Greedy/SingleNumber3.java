package Greedy;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber3 {
	public static List<Integer> singleNumberIII(int[] A) {
        // write your code here
        List<Integer> res = new ArrayList<Integer>();
        int x = 0;
        for(int n : A){
            x ^= n;
        }
        x &= -x;
        int x1 = 0;
        int x2 = 0;
        for(int n : A){
            if((n & x) == 0){
                x1 ^= n;
            }else{
                x2 ^= n;
            }
        }
        res.add(x1);
        res.add(x2);
        return res;
    }
	public static void main(String[] args) {
		int[] nums = {4, 12};
		singleNumberIII(nums);
	}
}
