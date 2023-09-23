package interviewBit;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>(1000, new DescComparator());

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 1) {
                queue.add(y);
            } else if (x == 2) {
                System.out.println(queue.isEmpty() ? -1 : queue.peek());
            } else if (x == 3 && !queue.isEmpty()) {
                queue.poll();
            }
        }
    }
}

class DescComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        if (a < b) {
            return 1;
        } else if (a > b) {
            return -1;
        }
        return 0;
    }
}
