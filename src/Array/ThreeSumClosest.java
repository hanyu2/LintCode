package Array;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        int min = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length - 2; i++){
            if(i != 0 && numbers[i] == numbers[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = numbers.length - 1;
            while(left < right){
                int sum = numbers[i] + numbers[left] + numbers[right];
                if(Math.abs(sum - target) < min){
                    min = Math.abs(sum - target);
                    res = sum;
                }
                if(sum < target){
                    while(left < right && numbers[left] == numbers[left + 1]){
                        left++;
                    }
                    left++;
                }else if(sum > target){
                    while(left < right && numbers[right] == numbers[right - 1]){
                        right--;
                    }
                    right--;
                }else{
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
