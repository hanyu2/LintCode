package Greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityNumber3 {
	public int majorityNumber(ArrayList<Integer> nums, int k) {
        // write your code
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            }else{
                map.put(n, 1);
            }
        }
        int times = 0;
        int can = 0;
        for(int key : map.keySet()){
            if(map.get(key) > nums.size() / k){
                if(map.get(key) > times){
                    can = key;
                    times = map.get(key);
                }
            }
        }
        return can;
    }
}
