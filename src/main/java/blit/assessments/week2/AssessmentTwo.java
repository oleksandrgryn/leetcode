package blit.assessments.week2;

public class AssessmentTwo {
    public static void main(String[] args) {
        validate(77);
        validate(17);

    }

    public static void validate(int x) {
        if (x % 10 == 7 && x % 7 == 0) {
            System.out.println("It is Buzz no");
        } else {
            throw new ArithmeticException("This is not a Buzz Number");
        }
    }
}
