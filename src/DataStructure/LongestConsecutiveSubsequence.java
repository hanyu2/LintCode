package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSubsequence {
	public int longestConsecutive(int[] num) {
        // write you code here
        int max = 0;
        if(num == null){
            return 0;
        }
        if(num.length <= 1){
            return num.length;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : num){
            if(!map.containsKey(i)){
                int left = map.containsKey(i - 1) ? map.get(i - 1) : 0;
                int right = map.containsKey(i + 1) ? map.get(i + 1) : 0;
                int len = left + right + 1;
                max = Math.max(max, len);
                map.put(i - left, len);
                map.put(i + right, len);
                map.put(i, len);
            }
        }
        return max;
    }
}
