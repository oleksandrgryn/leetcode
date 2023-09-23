package blit;

import java.util.ArrayList;

public class ExtractPalindromes {
    public static void main(String[] args) {
//        findPalindromes("My mom deserves a dad the best!");


//        String input = "Anna was driving civic to work";
        String input = "My mom deserves a dad the best!";
        System.out.println(
                extractPalindroms(input)
        );

        extractPalindroms("My mom deserves a dad the best!");

    }

    public static void findPalindromes(String s) {
        String[] words = s.split("\\W+");
        for (int i = 0; i < words.length; i++) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            if (words[i].equals(reversed)) {
                System.out.println(reversed);
            }
        }
    }

//    public static void findPalindromesCharAt(String str) {
//        String[] words = str.split("\\W+");
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words[i].length() / 2 - 1; j++) {
//                if (j == words[i].length() - j || (words[i].charAt(j) ==)
//                if (words[i].charAt(j) == words[i].charAt(words[i].length() - j)) {
//                    continue;
//                } else {
//                    break;
//                }
//                System.out.println(words[i]);
//            }
//        }
//    }


    public static ArrayList<String> extractPalindroms(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> palindroms = new ArrayList<>();
        int palindromsCount = 0;
        for (String word : words) {
            if (isPalindrom(word)) {
                palindroms.add(word);
            }
        }
        return palindroms;
    }

    public static boolean isPalindrom(String word) {
        word = word.toLowerCase();
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}



