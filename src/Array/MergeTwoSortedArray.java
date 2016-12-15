package Array;

public class MergeTwoSortedArray {
	public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
        int lenA = A.length;
        int lenB = B.length;
        int[] res = new int[lenA + lenB];
        int i = 0;
        int j = 0;
        int len = 0;
        while(i < lenA && j < lenB){
            if(A[i] <= B[j]){
                res[len++] = A[i++];
            }else{
                res[len++] = B[j++];
            }
        }
        if(i != lenA){
            while(i < lenA){
                res[len++] = A[i++];
            }
        }else if(j != lenB){
            while(j < lenB){
                res[len++] = B[j++];
            }
        }
        return res;
    }
}
