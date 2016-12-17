package BinarySearch;

public class WoodCut {
	public int woodCut(int[] L, int k) {
        // write your code here
        int max = 0;
        for(int len : L){
            max = Math.max(max, len);
        }
        int left = 0;
        int right = max;
        while(left < right){
            int mid = left + (right - left) / 2 + 1;
            if(cut(mid, L, k)){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    public boolean cut(int len, int[] L, int k){
        int sum = 0;
        for(int l : L){
            sum += l / len;
        }
        if(sum < k){
            return false;
        }else{
            return true;
        }
    }
}
