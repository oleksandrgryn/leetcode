package easy;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(powerOfTwo(0));
        System.out.println(powerOfTwo(1));
        System.out.println(powerOfTwo(2));
        System.out.println(powerOfTwo(3));
        System.out.println(powerOfTwo(5));
        System.out.println(powerOfTwo(6));
        System.out.println(powerOfTwo(9));
        System.out.println(powerOfTwo(16));
        System.out.println(powerOfTwo(4));

    }


//    public static boolean powerOfTwoBits(int n) {
//        if (n < 1) {
//            return false;
//        }
//
//        while (n>2 && ){
//
//
//            n/=2;
//        }
//
//
//        return false;
//    }
//           1  1
//          10  2
//         100  4
//        1000  8
//       10000  16

    public static boolean powerOfTwo(int n) {

        if (n < 1) {
            return false;
        }

        while (n > 1 && n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

    public static boolean powerOfTwoStraight(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }

        while (n / 2 > 2 && n % 2 == 0) {
            n /= 2;
        }

        return n % 2 == 0;
    }

    public static boolean PowerOfTwoBetter(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1 && n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}
