package SearchRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        combine(candidates, 0, 0, target, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void combine(int[] candidates, int start, int sum, int target, List<Integer> list, List<List<Integer>> res){
        if(sum > target){
            return;
        }
        if(sum == target){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i - 1]){
                continue;
            }
            list.add(candidates[i]);
            combine(candidates, i, sum + candidates[i], target, list, res);
            list.remove(list.size() - 1);
        }
    }
}
