package BinarySearch;

public class FirstBadVersion {
	public int findFirstBadVersion(int n) {
        // write your code here
        int left = 1;
        int right = n;
        while(left < right){
            int mid = (left + right) / 2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return isBadVersion(right) ? right : -1;
    }

	private boolean isBadVersion(int right) {
		// TODO Auto-generated method stub
		return false;
	}
}

