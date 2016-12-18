package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargerNumber {
	public String largestNumber(int[] num) {
        // write your code here
        List<Integer> list = new ArrayList<Integer>();
		for(int n : num){
			list.add(n);
		}
		Collections.sort(list, new Comparator<Integer>(){
			public int compare(Integer i1, Integer i2){
				String x1 = i1.toString();
				String x2 = i2.toString();
				String s1 = x1 + x2;
				String s2 = x2 + x1;
				return s2.compareTo(s1);
			}
		});
		StringBuilder sb = new StringBuilder();
		if(list.get(0) == 0){
		    return "0";
		}
		for(int i = 0; i < list.size(); i++){
		    sb.append(list.get(i));
		}
		return sb.toString();
    }
}
