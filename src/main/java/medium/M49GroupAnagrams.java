package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class M49GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    // agryn version
    public List<List<String>> groupAnagramsAGryn(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] sortedCharArray = str.toCharArray();
            Arrays.sort(sortedCharArray);
            String sortedStr = new String(sortedCharArray);

            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    // fake test to debug the main code
    @Test
    public void testGroupAnagrams() {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Assert.assertNotNull("str", groupAnagrams(strings));
    }
}
