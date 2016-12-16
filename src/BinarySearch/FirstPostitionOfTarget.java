package BinarySearch;

public class FirstPostitionOfTarget {
	public int binarySearch(int[] nums, int target) {
        //write your code here
        if(nums == null || nums.length == 1){
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[right] == target ? right : -1;
    }
}
