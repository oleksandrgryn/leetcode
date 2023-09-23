package easy;

public class Palindrome9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));

        String str = "0123456789";
        var vr = str.subSequence(1, 4);
        System.out.println(vr);

        System.out.println(revert(1234567801));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long reversedNumber = 0;
        long input = x;
        while (input != 0) {
            reversedNumber = reversedNumber * 10 + input % 10;
            input /= 10;
        }

        if (x == reversedNumber) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(int x) {
        if (x == Integer.reverse(x)) {
            return true;
        }
        return false;
    }

    public static int revert(int number) {
        String temp = Integer.toString(number);
        String result = "";
        char ch;

        for (int i = 0; i < temp.length(); i++) {
            result = temp.charAt(i)+result;
        }

        return Integer.parseInt(result);
    }

}
