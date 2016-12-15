package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExcludeItself {
	public static ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> res = new ArrayList<Long>();
        long n = 1;
        for(int i = 0; i < A.size(); i++){
            res.add(n);
            n *= A.get(i);
        }
        long right = A.get(A.size() - 1);
        for(int i = res.size() - 2; i >= 0; i--){
        		res.set(i, right * res.get(i));
            right *= A.get(i);
        }
        return res;
    }
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(productExcludeItself(list));
	}
}
