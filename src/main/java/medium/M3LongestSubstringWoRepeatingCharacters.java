package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class M3LongestSubstringWoRepeatingCharacters {

    // using array, 2ms, beats 99%
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    // using HasMap, 6ms, beats 70% (sometimes 5/88)
    public int lengthOfLongestSubstringUsingHashMap(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!map.containsKey(s.charAt(right)) || map.get(s.charAt(right)) < left) {
                map.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), right);
            }
        }
        return maxLength;
    }

    // using HashSet, 7ms, beats 44% (sometimes 6ms, 70%)
    public int lengthOfLongestSubstringUsingSet(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();

        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }

        }
        return maxLength;
    }

    @Test
    public void testLengthOfLongestSubstring() {
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";

        Assert.assertEquals(3, lengthOfLongestSubstring(str1));
        Assert.assertEquals(1, lengthOfLongestSubstring(str2));
        Assert.assertEquals(3, lengthOfLongestSubstring(str3));

    }
}
