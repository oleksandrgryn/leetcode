package easy.designHashMap706;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MyHashMapTest {


    @Test
    public void myHashMapTest1mln() {
        Random r = new Random();

        MyHashMap myHashMap = new MyHashMap();
        var before = System.currentTimeMillis();

        for (int i = 0; i < myHashMap.list.size(); i++) {
            myHashMap.put(r.nextInt(10000000), r.nextInt());
        }

        for (int i = 0; i < myHashMap.list.size(); i++) {
            myHashMap.remove(r.nextInt(10000000));
        }

        var after = System.currentTimeMillis();

        System.out.printf("10 mln records in MyHashMap, time in seconds: %d%n", (after - before) / 1000);


        MyHashMapNodes myHashMapNodes = new MyHashMapNodes();
        before = System.currentTimeMillis();

        for (int i = 0; i < myHashMapNodes.array.length; i++) {
            myHashMapNodes.put(r.nextInt(10000000), r.nextInt());
        }

        for (int i = 0; i < myHashMapNodes.array.length; i++) {
            myHashMapNodes.remove(r.nextInt(10000000));
        }

        after = System.currentTimeMillis();

        System.out.printf("10 mln records in MyHashMapNodes, time in seconds: %d%n", (after - before) / 1000);


        Map<Integer, Integer> map = new HashMap<>();

        before = System.currentTimeMillis();
        for (int i = 0; i < myHashMap.list.size(); i++) {
            map.put(r.nextInt(10000000), r.nextInt());
        }

        for (int i = 0; i < myHashMap.list.size(); i++) {
            map.remove(r.nextInt(10000000));
        }

        after = System.currentTimeMillis();

        System.out.printf("10 mln records in HashMap, time in seconds: %d%n", (after - before) / 1000);

    }
}
