package String;

import java.util.HashMap;
import java.util.Map;

public class CompareStrings {
	public boolean compareStrings(String A, String B) {
        if(B == null || B.length() == 0){
            return true;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : A.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        for(char c : B.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }else{
                map.put(c, map.get(c) - 1);
                if(map.get(c) < 0){
                    return false;
                }
            }
        }
        return true;
    }
}
