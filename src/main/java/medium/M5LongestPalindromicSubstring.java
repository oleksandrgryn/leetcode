package medium;

import org.junit.Assert;
import org.junit.Test;

public class M5LongestPalindromicSubstring {

    public String longestPalindrome(String s) {


        return "";
    }


    @Test
    public void testLongestPalindrome() {
        String s1 = "babad";
        String s2 = "cbbd";

        Assert.assertEquals("bab", longestPalindrome(s1));
        Assert.assertEquals("bb", longestPalindrome(s2));
    }
}
