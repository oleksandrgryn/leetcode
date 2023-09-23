package interviewBit;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Queues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 1) {
                queue.add(y);
            } else if (x == 2) {
                System.out.println(queue.isEmpty() ? -1 : queue.getFirst());
            } else if (x == 3){
                if (!queue.isEmpty()){
                    queue.removeFirst();
                }
            }
        }
        sc.close();
    }
}
