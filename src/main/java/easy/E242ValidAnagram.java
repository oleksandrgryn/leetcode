package easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class E242ValidAnagram {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println(isAnagramArrayAsHashOn(s1, s2));
    }

    public static boolean isAnagramArrayAsHashOn(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramOn(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);

        }
        Collection<Integer> valueSet = map.values();
        return valueSet.stream().allMatch(x -> x == 0);
    }

    public boolean isAnagramNlogN(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] stringS = s.toCharArray();
        char[] stringT = t.toCharArray();

        Arrays.sort(stringS);
        Arrays.sort(stringT);

        return Arrays.equals(stringS, stringT);

    }
}
