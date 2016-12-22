package SearchRecursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		// write your code here
		List<List<Integer>> res = new ArrayList<List<Integer>>();
	    combineNums(1, n, k, new ArrayList<Integer>(), res);
	    return res;
    }
    
    public void combineNums(int start, int n, int k, List<Integer> list, List<List<Integer>> res){
        if(k == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start; i <= n - k + 1; i++){
            list.add(i);
            combineNums(i + 1, n, k - 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
