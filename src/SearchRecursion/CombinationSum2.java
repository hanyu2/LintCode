package SearchRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
	public List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(num == null || num.length == 0){
            return res;
        }
        Arrays.sort(num);
        combine(num, 0, 0, new ArrayList<Integer>(), target, res);
        return res;
    }
    public void combine(int[] num, int start, int sum, List<Integer> list, int target, List<List<Integer>> res){
        if(sum > target){
            return;
        }
        if(sum == target){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = start; i < num.length; i++){
            if(i > start && num[i] == num[i - 1]){
                continue;   
            }
            list.add(num[i]);
            combine(num, i + 1, sum + num[i], list, target, res);
            list.remove(list.size() - 1);
        }
    }
}
