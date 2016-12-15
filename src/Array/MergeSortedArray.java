package Array;

public class MergeSortedArray {
	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        m--;
        n--;
        int i = m + n + 1;
        while(m >= 0 && n >= 0){
            if(A[m] > B[n]){
                A[i--] = A[m--];
            }else{
                A[i--] = B[n--];
            }
        }
        if(m < 0){
            while(i >= 0){
                A[i--] = B[n--];
            }
        }
    }
}
