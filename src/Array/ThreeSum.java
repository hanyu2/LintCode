package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(numbers == null || numbers.length < 3){
            return res;
        }
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length - 2; i++){
            if(i != 0 && numbers[i] == numbers[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = numbers.length - 1;
            while(left < right){
                int sum = numbers[i] + numbers[left] + numbers[right];
                if(sum == 0){
                    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers[i], numbers[left], numbers[right]));
                    res.add(list);
                    while(left < right && numbers[left] == numbers[left + 1]){
                        left++;
                    }
                    left++;
                    while(left < right && numbers[right] == numbers[right - 1]){
                        right--;
                    }
                    right--;
                }else if(sum < 0){
                    while(left < right && numbers[left] == numbers[left + 1]){
                        left++;
                    }
                    left++;
                }else{
                    while(left < right && numbers[right] == numbers[right - 1]){
                        right--;
                    }
                    right--;
                }
            }
        }
        return res;
    }
}
