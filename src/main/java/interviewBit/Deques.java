package interviewBit;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> deque2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 1) {
                deque2.addLast(y);
            } else if (x == 2) {
                deque2.addFirst(y);
            } else if (x == 3) {
                System.out.println(deque2.isEmpty() ? -1 : deque2.getFirst());
            } else if (x == 4) {
                System.out.println(deque2.isEmpty() ? -1 : deque2.getLast());
            } else if (x == 5) {
                if (!deque2.isEmpty())
                    deque2.removeFirst();
            } else if (x == 6) {
                if (!deque2.isEmpty())
                    deque2.removeLast();
            }
        }
    }
}
