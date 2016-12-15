package Array;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        // write your code here
        int len = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[len]){
                nums[++len] = nums[i];
            }
        }
        return len + 1;
    }
}
