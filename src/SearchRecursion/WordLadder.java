package SearchRecursion;

import java.util.HashSet;
import java.util.Set;

public class WordLadder {
	public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if(start.equals(end)){
            return 1;
        }
        Set<String> startSet = new HashSet<String>();
        startSet.add(start);
        int depth = 1;
        while(!startSet.isEmpty()){
            Set<String> nextSet = new HashSet<String>();
            for(String s : startSet){
                char[] ch = s.toCharArray();
                for(int i = 0; i < ch.length; i++){
                    char old = ch[i];
                    for(char c = 'a'; c <= 'z'; c++){
                        ch[i] = c;
                        String str = String.valueOf(ch);
                        if(str.equals(end)){
                            return depth + 1;
                        }
                        if(dict.contains(str)){
                            nextSet.add(str);
                        }
                    }
                    ch[i] = old;
                }
            }
            startSet.addAll(nextSet);
            nextSet.clear();
            depth++;
        }
        return 0;
    }
}
