package SearchRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(nums == null || nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        sub(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }
    public void sub(int[] nums, int start, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res){
        res.add(list);
        for(int i = start; i < nums.length; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>(list);
            temp.add(nums[i]);
            sub(nums, i + 1, temp, res);
        }
    }
}
