package interviewBit;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
////        scanner.nextLine();
        int t = Integer.parseInt(scanner.nextLine());
        Stack<Character> stack;
        int flag = 0;

        for (int i = 0; i < t; i++) {
            flag = 0;
            stack = new Stack<Character>();
            String str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    stack.push(c);
                }
                if (stack.isEmpty()) {
                    flag = 1;
                    break;
                }
                if (c == ')') {
                    stack.pop();
                }
            }
            if(stack.isEmpty()&&flag==0){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
