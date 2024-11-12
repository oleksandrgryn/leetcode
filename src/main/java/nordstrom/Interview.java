package nordstrom;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview {
    /*
     * Click `Run` to execute the snippet below!
     */

    public static boolean isPalindromePermutationArray(final String input) {
//        String trimmedString = input.trim();
        String trimmedString = input.replaceAll("\\s", "");
        int[] array = new int[26];
        for (Character c : trimmedString.toCharArray()) {
            array[c - 'a']++;
        }
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
            }
        }
        return count <= 1;
    }

    public static boolean isPalindromePermutation(final String input) {

        String trimmedString = input.replaceAll("\\s", "");
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : trimmedString.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        int count = 0;
        var collection = map.values();
        for (int num : collection) {
            if (num % 2 == 1) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        System.out.println("Lets test these permutations out!");

        List<String> strings = new ArrayList<String>();
        strings.add("mom"); //true
        strings.add("happy"); //false
        strings.add("nono"); //true
        strings.add("carrace"); //true
        strings.add("racecar"); //true

        for (String string : strings) {

            System.out.println(string
                    + " has a palindrome permutation:"
                    + isPalindromePermutation(string));
        }
    }

    @Test
    public void testIsPalindromePermutation() {
        Assert.assertTrue(isPalindromePermutationArray("mom"));
        Assert.assertFalse(isPalindromePermutationArray("happy"));
        Assert.assertTrue(isPalindromePermutationArray("nono"));
        Assert.assertTrue(isPalindromePermutationArray("car race"));
        Assert.assertTrue(isPalindromePermutationArray("race car"));
    }

}
