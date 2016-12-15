package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
        /* your code */
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(numbers == null || numbers.length < 4){
            return res;
        }
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length - 3; i++){
            if(i != 0 && numbers[i] == numbers[i - 1]){
                continue;
            }
            for(int j = i + 1; j < numbers.length - 2; j++){
                if(j != i + 1 && numbers[j] == numbers[j - 1]){
                    continue;
                }
                int left = j + 1;
                int right = numbers.length - 1;
                while(left < right){
                    int sum = numbers[i] + numbers[j] + numbers[left] + numbers[right];
                    if(sum == target){
                        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers[i], numbers[j], numbers[left], numbers[right]));
                        res.add(list);
                        while(left < right && numbers[left] == numbers[left + 1]){
                            left++;
                        }
                        while(left < right && numbers[right] == numbers[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum < target){
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
        }
        return res;
    }
}
