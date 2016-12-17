package BinarySearch;

public class SearchInRotatedSortedArray {
	public boolean search(int[] A, int target) {
        // write your code here
        if(A == null){
            return false;
        }
        int left = 0;
        int right = A.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(A[mid] == target){
                return true;
            }
            if(A[mid] > A[left]){
                if(target < A[mid] && target >= A[left]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else if(A[mid] < A[left]){
                if(target > A[mid] && target <= A[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{
                left++;
            }
        }
        return false;
	}
}
