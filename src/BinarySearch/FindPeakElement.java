package BinarySearch;

public class FindPeakElement {
	public int findPeak(int[] A) {
        // write your code here
        int left = 0;
        int right = A.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(A[mid] > A[mid - 1] && A[mid] > A[mid + 1]){
                return mid;
            }
            if(A[mid] < A[mid + 1]){
                left = mid + 1;
            }else if(A[mid] < A[mid - 1]){
                right = mid - 1;
            }
        }
        return -1;
    }
}
