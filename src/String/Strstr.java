package String;

public class Strstr {
	public int strStr(String source, String target) {
        //write your code here
        if(source == null || target == null){
            return -1;
        }
        int sourceLength = source.length();
        int targetLength = target.length();
        for(int i = 0; i <= sourceLength - targetLength; i++){
            String s1 = source.substring(i, i + targetLength);
            if(s1.equals(target)){
                return i;
            }
        }
        return -1;
    }
}
