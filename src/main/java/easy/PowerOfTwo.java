package easy;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(1/2);

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
