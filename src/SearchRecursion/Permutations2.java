package SearchRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
	public List<List<Integer>> permuteUnique(int[] nums) {
        // Write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null){
            return res;
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for(int n : nums){
            list.add(n);
        }
        permute(list, 0, res);
        return res;
    } 
    public void permute(List<Integer> list, int start, List<List<Integer>> res){
        if(start == list.size()){
            res.add(new ArrayList(list));
            return;
        }
        for(int i = start; i < list.size(); i++){
            if(i != start && list.get(i) == list.get(i - 1)){
                continue;
            }
            list.add(start, list.get(i));
            list.remove(i + 1);
            permute(list, start + 1, res);
            list.add(i + 1, list.get(start));
            list.remove(start);
        }
    }
}
