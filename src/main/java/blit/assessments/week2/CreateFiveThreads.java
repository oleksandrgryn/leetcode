package blit.assessments.week2;

import java.util.ArrayList;
import java.util.List;

public class CreateFiveThreads extends Thread {
    public String name;

    public CreateFiveThreads(String name) {
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {
        CreateFiveThreads t1 = new CreateFiveThreads("First");
        CreateFiveThreads t2 = new CreateFiveThreads("Second");
        CreateFiveThreads t3 = new CreateFiveThreads("Third");
        CreateFiveThreads t4 = new CreateFiveThreads("Fourth");
        CreateFiveThreads t5 = new CreateFiveThreads("Fifth");

        List<Thread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);

        for (Thread thread : threads) {
            System.out.println(thread.getName() + ": " + thread.getPriority());
        }

        for (Thread thread : threads) {
            thread.setPriority(4);
        }

        System.out.println();
        for (Thread thread : threads) {
            System.out.println(thread.getName() + ": " + thread.getPriority());
        }

        t1.start();
        sleep(5000);
        t1.join();
    }
}
