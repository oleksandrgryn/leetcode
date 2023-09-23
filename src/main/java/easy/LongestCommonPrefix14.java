package easy;

public class LongestCommonPrefix14 {

    public static void main(String[] args) {
        String[] strs1 = new String[]{"flower", "flow", "flight"};
        String[] strs2 = new String[]{"dog", "racecar", "car"};
        String[] strs3 = new String[]{""};
        String[] strs4 = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
    }


    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs != null && !strs[0].isEmpty()) {
            char c = strs[0].charAt(0);

            for (int j = 0; j < strs[0].length(); j++) {
                for (int i = 0; i < strs.length - 1; i++) {

                    if (j > strs[i + 1].length() - 1 || strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                        return result.toString();
                    }
                    c = strs[i].charAt(j);
                }
                result.append(c);
            }
        }
        return result.toString();
    }
}
