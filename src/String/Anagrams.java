package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> res = new ArrayList<String>();
        if(strs == null || strs.length <= 1){
            return res;
        }
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String s : strs){
            String newStr = convert(s);
            ArrayList<String> list = null;
            if(map.containsKey(newStr)){
                list = map.get(newStr);
            }else{
                list = new ArrayList<String>();
            }
            list.add(s);
            map.put(newStr, list);
        }
        for(String s : map.keySet()){
            if(map.get(s).size() >= 2){
                res.addAll(map.get(s));
            }
        }
        return res;
    }
    public String convert(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String newStr = String.valueOf(chars);
        return newStr;
    }
}
