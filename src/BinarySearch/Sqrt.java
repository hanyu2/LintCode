package BinarySearch;

public class Sqrt {
	public int sqrt(int x) {
        if(x == 0){
            return 0;
        }
        // write your code here
        int left = 0;
        int right = Integer.MAX_VALUE;
        while(left <= right){
            int mid = (left + right) / 2;
            if(mid < x / mid){
                if(mid + 1 > x / (mid + 1)){
                    return mid;
                }
                left = mid + 1;
            }else if(mid > x / mid){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return 0;
    }
}
