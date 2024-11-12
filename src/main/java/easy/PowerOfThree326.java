package easy;

public class PowerOfThree326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-1));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(4));
        System.out.println(isPowerOfThree(5));
        System.out.println(isPowerOfThree(6));
        System.out.println(isPowerOfThree(7));
        System.out.println(isPowerOfThree(8));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(10));
        System.out.println(isPowerOfThree(11));
        System.out.println(isPowerOfThree(12));
        System.out.println(isPowerOfThree(27));


    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n > 1 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public boolean isPowerOfThreeRecursion(int n) {
        return n > 0 && (n == 1 || (n % 3 == 0 && isPowerOfThree(n / 3)));
    }

    public boolean isPowerOfThreeO1(int n) {
        //================ O(logN base 3) ===================
        // while(n>=3) {
        //     if(n%3!=0) return false;
        //     n/=3;
        // }
        // return n==1;
        //================= O(1) ==========================
        return (n>0 && 1162261467%n==0);
    }
}
