import java.util.HashMap;

public class Valid_anagram {

    // Make inner class static so we can call it directly
    static class Anagram {

        static HashMap<Character, Integer> makeFreqMap(String str) {
            HashMap<Character, Integer> mp = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            }
            return mp;
        }

        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            HashMap<Character, Integer> mp1 = makeFreqMap(s);
            HashMap<Character, Integer> mp2 = makeFreqMap(t);
            return mp1.equals(mp2);
        }
    }

    public static void main(String[] args) {
        Anagram an = new Anagram();
        String s = "listen";
        String t = "silent";

        System.out.println(an.isAnagram(s, t)); // Expected: true
    }
}
