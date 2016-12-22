package SearchRecursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public List<List<Integer>> permute(int[] nums) {
        // write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums == null){
            return res;
        }
        perm(nums, 0, res); 
        return res;
    }
    
    public void perm(int[] nums, int start, List<List<Integer>> res){
        if(start == nums.length){
            List<Integer> list = new ArrayList<Integer>();
            for(int i : nums){
                list.add(i);
            }
            res.add(list);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            perm(nums, start + 1, res);
            swap(nums, start, i);
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
