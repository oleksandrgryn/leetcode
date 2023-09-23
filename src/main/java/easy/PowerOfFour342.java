package easy;

public class PowerOfFour342 {

    public static void main(String[] args) {
//        System.out.println(3^6);

        System.out.println(isPowerOfFourUsingBits(0));

    }


    public static boolean isPowerOfFourUsingBits(int n) {
        if (n < 1) {
            return false;
        }

        String bits = Integer.toBinaryString(n);
        System.out.println(bits);
        int counter = 1;
        while (counter < bits.length()) {
            if (Character.getNumericValue((bits.charAt(counter))) == 1) {
                return false;
            }
            counter++;
        }
        return bits.length() % 2 != 0;
    }

    public static boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 4 && n % 4 == 0) {
            n /= 4;
        }
        return n == 4;
    }

}
