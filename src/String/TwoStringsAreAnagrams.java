package String;

public class TwoStringsAreAnagrams {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static boolean anagram(String s, String t) {
        s = s.replaceAll("\\s+", "");
        t = t.replaceAll("\\s+", "");
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() != t.length()){
            return false;
        }
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        long s1 = 1;
        for(char c : s.toCharArray()){
            s1 *= primes[c - 'a'];
        }
        long t1 = 1;
        for(char c : t.toCharArray()){
            t1 *= primes[c - 'a'];
        }
        return s1 == t1;
    }
    
    public static void main(String[] args) {
		System.out.println(anagram("A tidy tiger tied a tie tighter to tidy her tiny tail", "iat  elyrteAteyhii g ttdoiy  r ei   tttihngi atdtdrie"));
	}
}
